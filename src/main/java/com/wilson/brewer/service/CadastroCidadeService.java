package com.wilson.brewer.service;

import java.util.Optional;

import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wilson.brewer.model.Cidade;
import com.wilson.brewer.repository.Cidades;
import com.wilson.brewer.service.exception.ImpossivelExcluirEntidadeException;
import com.wilson.brewer.service.exception.NomeCidadeJaCadastradaException;

@Service
public class CadastroCidadeService {
	
	@Autowired
	private Cidades cidades;
	
	@Transactional
	public void salvar(Cidade cidade) {
		Optional<Cidade> cidadeExistente = cidades.findByNomeAndEstado(cidade.getNome(), cidade.getEstado());
		if (cidadeExistente.isPresent() && !cidadeExistente.get().equals(cidade)){
			throw new NomeCidadeJaCadastradaException("Nome da cidade já está cadastrado");
		}
		cidades.save(cidade);
	}

	@Transactional
	public void excluir(Long codigo) {
		try {
			cidades.delete(codigo);
			cidades.flush();
		} catch (PersistenceException e) {
			throw new ImpossivelExcluirEntidadeException("Impossível apagar Cidade. Já está sendo usada no endereço de algum cliente.");
		}
	}
}
