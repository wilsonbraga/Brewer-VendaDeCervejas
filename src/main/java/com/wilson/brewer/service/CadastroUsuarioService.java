package com.wilson.brewer.service;

import java.util.Optional;

import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.wilson.brewer.model.Usuario;
import com.wilson.brewer.repository.Usuarios;
import com.wilson.brewer.service.exception.EmailUsuarioJaCadastradoException;
import com.wilson.brewer.service.exception.ImpossivelExcluirEntidadeException;
import com.wilson.brewer.service.exception.SenhaObrigatoriaUsuarioException;

@Service
public class CadastroUsuarioService {
	
	@Autowired
	private Usuarios usuarios;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	@Transactional
	public void salvar(Usuario usuario){
		// ver se já tem um E-mail igual antes de salvar o usuario
		Optional<Usuario> usuarioExistente = usuarios.findByEmail(usuario.getEmail());
		if (usuarioExistente.isPresent() && !usuarioExistente.get().equals(usuario)){
			throw new EmailUsuarioJaCadastradoException("E-mail já cadastrado");
		}
		
		if (usuario.isNovo() && StringUtils.isEmpty(usuario.getSenha())) {
			throw new SenhaObrigatoriaUsuarioException("Senha é obrigatória para novo usuário");
		}
		
		if(usuario.isNovo() || !StringUtils.isEmpty(usuario.getSenha())){
			usuario.setSenha(this.passwordEncoder.encode(usuario.getSenha()));
		}else if (StringUtils.isEmpty(usuario.getSenha())){
			usuario.setSenha(usuarioExistente.get().getSenha());
		}
		usuario.setConfirmacaoSenha(usuario.getSenha());
		
		if(!usuario.isNovo() && usuario.getAtivo() == null){
			usuario.setAtivo(usuarioExistente.get().getAtivo());
		}
		
		usuarios.save(usuario);
	}

	@Transactional
	public void alterarStatus(Long[] codigos, StatusUsuario statusUsuario) {
		statusUsuario.executar(codigos, usuarios);
	}

	@Transactional
	public void excluir(Long codigo) {
		try {
			usuarios.delete(codigo);
			usuarios.flush();
			
		} catch (PersistenceException e) {
			throw new ImpossivelExcluirEntidadeException("Impossível apagar este Usuário, ele está sendo usado para gerenciar uma venda.");
		}
	}

}
