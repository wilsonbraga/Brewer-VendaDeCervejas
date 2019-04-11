package com.wilson.brewer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wilson.brewer.model.Venda;
import com.wilson.brewer.repository.helper.venda.VendasQueries;

public interface Vendas extends JpaRepository<Venda, Long>, VendasQueries {

}
