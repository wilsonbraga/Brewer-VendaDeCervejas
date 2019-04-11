package com.wilson.brewer.service.event.venda;

import com.wilson.brewer.model.Venda;

public class VendaEvent {
	
	private Venda venda;

	public VendaEvent(Venda venda) {
		this.venda = venda;
	}
	
	public Venda getVenda() {
		return venda;
	}
	
}
