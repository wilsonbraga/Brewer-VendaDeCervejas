package com.wilson.brewer.service;

import java.util.Optional;

import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wilson.brewer.model.Cliente;
import com.wilson.brewer.repository.Clientes;
import com.wilson.brewer.service.exception.CpfCnpjClienteJaCadastradoException;
import com.wilson.brewer.service.exception.ImpossivelExcluirEntidadeException;

@Service
public class CadastroClienteService {
	
	@Autowired
	private Clientes clientes;
	
	@Transactional
	public void salvar(Cliente cliente) {
		Optional<Cliente> clienteExistente = clientes.findByCpfOuCnpj(cliente.getCpfOuCnpjSemFormatacao());
		if (clienteExistente.isPresent() && !clienteExistente.get().equals(cliente)) {
			throw new CpfCnpjClienteJaCadastradoException("CPF/CNPJ já cadastrado");
		}
		
		clientes.save(cliente);
	}

	@Transactional
	public void excluir(Long codigo) {
		try {
			clientes.delete(codigo);
			clientes.flush();
		} catch (PersistenceException e) {
			throw new ImpossivelExcluirEntidadeException("Impossível apagar Cliente, ele está sendo usada em uma venda.");
		}
	}
}
