package com.wilson.brewer.model;

public enum Sabor {
	
	ADOCICADO("Adocicada"),
	AMARGA("Amarga"),
	FORTE("Forte"),
	FRUTADA("Frutada"),
	SUAVE("Suave");
	private String descricao;
	
	Sabor(String descricao){
		this.descricao	= descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	

}
