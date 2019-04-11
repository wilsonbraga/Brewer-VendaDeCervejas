package com.wilson.brewer.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wilson.brewer.model.Cerveja;
import com.wilson.brewer.repository.helper.cerveja.CervejasQueries;

@Repository
public interface Cervejas extends JpaRepository<Cerveja, Long>,CervejasQueries{
	
	/* Para Classe Cervejas funcionar, temos que declarar ela na class JpaConfig 
	 * com à seguinte anotação 
	 * @EnableJpaRepositories(basePackageClasses = Cervejas.class, enableDefaultTransactions = false
	 *  Essa anotação ativar os repositórios JPA. Ela Irá varrer os pacotes das classes
	 *  de configuração anotada com @Repository para funcionar o Spring Data.*/
	
}
