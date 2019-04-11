package com.wilson.brewer.repository.helper.cerveja;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wilson.brewer.dto.CervejaDTO;
import com.wilson.brewer.dto.ValorItensEstoque;
import com.wilson.brewer.model.Cerveja;
import com.wilson.brewer.repository.filter.CervejaFilter;

public interface CervejasQueries {

	public Page<Cerveja> filtrar(CervejaFilter filtro, Pageable pageable);
	
	public List<CervejaDTO> porSkuOuNome(String skuOuNome);
	
	public ValorItensEstoque valorItensEstoque();
}
