package com.wilson.brewer.repository.helper.venda;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wilson.brewer.dto.VendaMes;
import com.wilson.brewer.dto.VendaOrigem;
import com.wilson.brewer.model.Venda;
import com.wilson.brewer.repository.filter.VendaFilter;

public interface VendasQueries {
	
	public Page<Venda> filtrar (VendaFilter filtro, Pageable pageable);
	
	public Venda buscarComItens(Long codigo);
	
	public BigDecimal valorTotalNoAno();
	public BigDecimal valorTotalNoMes();
	public BigDecimal valorTicketMedioNoAno();
	
	
	public List<VendaMes> totalPorMes();
	public List<VendaOrigem> totalPorOrigem();
	
	

}
