package com.algaworks.brewer.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.brewer.model.Cerveja;
import com.algaworks.brewer.repository.helper.cerveja.CervejasQueries;

@Repository
public interface Cervejas extends JpaRepository<Cerveja, Long>,CervejasQueries{
	
	/* Para essa Classe funcionar temos que declarar ela na class JpaConfig 
	 * com a anotação 
	 * @EnableJpaRepositories(basePackageClasses = Cervejas.class, enableDefaultTransactions = false
	 *  Anotação para ativar os repositórios JPA. Irá varrer o pacote da classe
	 *  de configuração anotada para repositórios Spring Data por padrão.*/
	
}
