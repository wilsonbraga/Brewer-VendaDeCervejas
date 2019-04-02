package com.algaworks.brewer.thymeleaf;

import java.util.HashSet;
import java.util.Set;

import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.processor.IProcessor;
import org.thymeleaf.standard.StandardDialect;

import com.algaworks.brewer.thymeleaf.processor.ClassForErrorAttributeTagProcessor;
import com.algaworks.brewer.thymeleaf.processor.MenuAttributeTagProcessor;
import com.algaworks.brewer.thymeleaf.processor.MessageElementTagProcessor;
import com.algaworks.brewer.thymeleaf.processor.OrderElementTagProcessor;
import com.algaworks.brewer.thymeleaf.processor.PaginationElementTagProcesso;
	/*classe responsavel por completar nosso processor , 
	 * Nesse caso, nosso dialeto está fornecendo apenas 
	 * processadores, portanto, ele será implementado IProcessorDialect.*/
public class BrewerDialect extends AbstractProcessorDialect{
	
	public BrewerDialect() {
		super("Sistema Brewer", "brewer", StandardDialect.PROCESSOR_PRECEDENCE );
	}
	
	
	@Override
	public Set<IProcessor> getProcessors(String dialectPrefix) {
		
		final Set<IProcessor> processadores = new HashSet<>();
		processadores.add(new ClassForErrorAttributeTagProcessor(dialectPrefix));//TAG DE ERRO
		processadores.add(new MessageElementTagProcessor(dialectPrefix)); //TAG DE MENSAGEM
		processadores.add(new OrderElementTagProcessor(dialectPrefix));
		processadores.add(new PaginationElementTagProcesso(dialectPrefix));
		processadores.add(new MenuAttributeTagProcessor(dialectPrefix));
		return processadores;
	}

}
