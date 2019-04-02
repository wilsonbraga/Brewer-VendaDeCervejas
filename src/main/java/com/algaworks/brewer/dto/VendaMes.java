package com.algaworks.brewer.dto;

public class VendaMes {
	
	private String mes;
	private Integer Total;
	
	public VendaMes(String mes, Integer total) {
		this.mes = mes;
		Total = total;
	}
	
	public String getMes() {
		return mes;
	}
	
	public void setMes(String mes) {
		this.mes = mes;
	}
	
	public Integer getTotal() {
		return Total;
	}
	
	public void setTotal(Integer total) {
		Total = total;
	}
	
	
}
