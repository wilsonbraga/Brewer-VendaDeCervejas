package com.wilson.brewer.repository.filter;

import com.wilson.brewer.model.Estado;

public class CidadeFilter {
	
	private Estado estado;
	private String nome;
	
	public Estado getEstado() {
		return estado;
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
