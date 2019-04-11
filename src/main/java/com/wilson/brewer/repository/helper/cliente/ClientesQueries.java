package com.wilson.brewer.repository.helper.cliente;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wilson.brewer.model.Cliente;
import com.wilson.brewer.repository.filter.ClienteFilter;

public interface ClientesQueries {
	
	public Page<Cliente> filtrar(ClienteFilter filtro, Pageable pageable);
}
