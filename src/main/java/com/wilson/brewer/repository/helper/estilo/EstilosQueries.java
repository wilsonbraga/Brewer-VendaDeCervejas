package com.wilson.brewer.repository.helper.estilo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wilson.brewer.model.Estilo;
import com.wilson.brewer.repository.filter.EstiloFilter;

public interface EstilosQueries {
	
	public Page<Estilo> filtrar(EstiloFilter filtro, Pageable pageable);
	
}
