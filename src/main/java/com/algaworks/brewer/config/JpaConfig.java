package com.algaworks.brewer.config;

import java.net.URI;
import java.net.URISyntaxException;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.algaworks.brewer.model.Cerveja;
import com.algaworks.brewer.repository.Cervejas;

@Configuration
@ComponentScan(basePackageClasses= Cervejas.class)
@EnableJpaRepositories(basePackageClasses = Cervejas.class, enableDefaultTransactions = false) 
@EnableTransactionManagement 
public class JpaConfig {
	
			/*ANOTACOES DA CLASSE DE CONFIGURAÇÃO DO SPRING FRAMEWORK E SUAS FUNCOES */
	
	/* A @Configuration Configuração Indica que uma classe declara um ou mais @Bean métodos e pode ser processada pelo contêiner Spring para gerar definições de bean e solicitações de serviço para esses beans em tempo de execução, por exemplo:
	 * A NOTAÇÃO @ComponentScan, Configura diretivas de verificação de componentes
	 * A ANOTAÇÃO (basePackageClasses), Alternativa de tipo seguro basePackages()para especificar os pacotes para procurar componentes anotados. A classe Cervejas.class contem componentes "@Repository" 
	 * A Anotação @EnableJpaRepositories, é para ativar os repositórios JPA. Irá varrer o pacote da classe de configuração anotada para repositórios Spring Data por padrão. 
	 * A ANOTAÇÃO (basePackageClasses = Cervejas.class) Alternativa de segurança de tipos para (basePackages) para especificar os pacotes para procurar componentes anotados. 
	 * A enableDefaultTransactions = false, Configura se deve ativar transações padrão para repositórios Spring Data JPA.
	 * A ANOTAÇÃO @EnableTransactionManagement  Ativa o recurso de gerenciamento de transações orientado por anotações do Spring, semelhante ao suporte encontrado no <tx:*>namespace XML do Spring . Para ser usado nas @Configuration classes da seguinte maneira:
	 *
	 * */
	
	//RECUPAR O DATA SOURCE QUE ESTÁ CONFIGURADO NA PASTA META-INF DO PROJETO 
	@Profile("local")
	@Bean
	public DataSource dataSource(){
		//COM ESSE OBJETO RECUPERAR-SE UM DATASOURCE
		JndiDataSourceLookup dataSourceLookup = new JndiDataSourceLookup();
		
		dataSourceLookup.setResourceRef(true);
		return dataSourceLookup.getDataSource("jdbc/brewerDB");
	}
	
	@Profile("prod")
	@Bean
	public DataSource dataSourceProd() throws URISyntaxException{
		URI jdbUri = new URI(System.getenv("JAWSDB_URL"));

	    String username = jdbUri.getUserInfo().split(":")[0];
	    String password = jdbUri.getUserInfo().split(":")[1];
	    String port = String.valueOf(jdbUri.getPort());
	    String jdbUrl = "jdbc:mysql://" + jdbUri.getHost() + ":" + port + jdbUri.getPath();
	   
	    BasicDataSource dataSource = new BasicDataSource();
	    dataSource.setUrl(jdbUrl);
	    dataSource.setUsername(username);
	    dataSource.setPassword(password);
	    dataSource.setInitialSize(8);
	    return dataSource;
	}
	

	
	//CONFIGURACAO DO HIBERNATE
	@Bean
	public JpaVendorAdapter jaAdapter(){
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setDatabase(Database.MYSQL);//O NOME DO BANCO DE DADOS QUE ESTOU USANDO
		adapter.setShowSql(false);
		adapter.setGenerateDdl(false);
		adapter.setDatabasePlatform("org.hibernate.dialect.MySQLDialect"); //DIALETO DO BANCO
		
		return adapter;
	}
	//CRIACAO DO ENTITYMANAGERFACTORY
	@Bean
	public  EntityManagerFactory entityManagerFactory(DataSource dataSource,JpaVendorAdapter jpaVendorAdapter){
		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		factory.setDataSource(dataSource);
		factory.setJpaVendorAdapter(jpaVendorAdapter);
		factory.setPackagesToScan(Cerveja.class.getPackage().getName());
		factory.setMappingResources("sql/consultas-nativas.xml");
		factory.afterPropertiesSet();
		return factory.getObject();
		
	}
	//TRANSASSAO DO ENTITYMANAGER
	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory){
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory);
		return transactionManager;
	}
	
}

