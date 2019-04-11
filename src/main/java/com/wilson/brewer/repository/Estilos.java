package com.wilson.brewer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wilson.brewer.model.Estilo;
import com.wilson.brewer.repository.helper.estilo.EstilosQueries;

@Repository
public interface Estilos extends JpaRepository<Estilo, Long>, EstilosQueries {

	public Optional<Estilo> findByNomeIgnoreCase(String nome);
	
}
