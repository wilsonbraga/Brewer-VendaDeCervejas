package com.algaworks.brewer.controller.validator;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.algaworks.brewer.model.Venda;

@Component
public class VendaValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return Venda.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		//rejectIfEmpty: Rejeitar o campo fornecido com o código de erro fornecido, se o valor estiver vazio.
		ValidationUtils.rejectIfEmpty(errors, "cliente.codigo", "", "Selecione um cliente na lupa para efetuar uma venda");
		
		Venda venda =(Venda) target;
		
		validarSeInformouApenasHorarioEntrega(errors, venda);
		validarSeInformouItens(errors, venda);
		validarValorTotalNegativo(errors, venda);
		
	}
	
	private void validarValorTotalNegativo(Errors errors, Venda venda) {
		//compareTo: compara dois valores BigDecial 
		if(venda.getValorTotal().compareTo(BigDecimal.ZERO) < 0){
			errors.reject("", "Valor Total não pode ser negativo");
		}
	}

	private void validarSeInformouItens(Errors errors, Venda venda) {
		//reject: Registra um erro global para todo o objeto de destino, usando a descrição de erro fornecida.
		if(venda.getItens().isEmpty()){
			errors.reject("", "Adicione pelo menos uma cerveja na venda");
		}
	}

	private void validarSeInformouApenasHorarioEntrega(Errors errors, Venda venda) {
		//rejectValue: Registra um erro de campo para o campo especificado do objeto atual (respeitando o caminho aninhado atual, se houver), usando a descrição de erro fornecida.
		if(venda.getHorarioEntrega() != null && venda.getDataEntrega() == null){
			errors.rejectValue("dataEntrega", "", "Informe uma data da entrega para um horário");
		}
	}

}
