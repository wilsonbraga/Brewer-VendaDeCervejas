package com.wilson.brewer.repository.helper.cidade;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wilson.brewer.model.Cidade;
import com.wilson.brewer.repository.filter.CidadeFilter;

public interface CidadesQueries {
	
	public Page<Cidade> filtrar(CidadeFilter filter, Pageable pageable);
	
	public Cidade buscarComEstados(Long codigo);
}
