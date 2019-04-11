package com.wilson.brewer.service;

import java.util.Optional;

import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wilson.brewer.model.Estilo;
import com.wilson.brewer.repository.Estilos;
import com.wilson.brewer.service.exception.ImpossivelExcluirEntidadeException;
import com.wilson.brewer.service.exception.NomeEstiloJaCadastradoException;

@Service
public class CadastroEstiloService {
	
	@Autowired
	private Estilos estilos;
	
	@Transactional
	public Estilo salvar(Estilo estilo) {
		Optional<Estilo> estiloOptional = estilos.findByNomeIgnoreCase(estilo.getNome());
		if (estiloOptional.isPresent()) {
			throw new NomeEstiloJaCadastradoException("Nome do estilo já cadastrado");
		}
		
		return estilos.saveAndFlush(estilo);
	}

	@Transactional
	public void excluir(Long codigo) {
		try {
			estilos.delete(codigo);
			estilos.flush();

		} catch (PersistenceException e) {
			throw new ImpossivelExcluirEntidadeException("Impossível apagar este Estilo, ele está sendo usado em uma cerveja.");
		}
	}
}
