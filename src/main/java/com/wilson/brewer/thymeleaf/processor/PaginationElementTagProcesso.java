package com.wilson.brewer.thymeleaf.processor;

import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.model.IAttribute;
import org.thymeleaf.model.IModel;
import org.thymeleaf.model.IModelFactory;
import org.thymeleaf.model.IProcessableElementTag;
import org.thymeleaf.processor.element.AbstractElementTagProcessor;
import org.thymeleaf.processor.element.IElementTagStructureHandler;
import org.thymeleaf.templatemode.TemplateMode;
//classe responsavel por criar um processador para pagina
public class PaginationElementTagProcesso extends AbstractElementTagProcessor {

	private static final String NOME_TAG = "pagination";
	private static final int PRECEDENCIA = 1000;
	
	public PaginationElementTagProcesso(String dialectPrefix){
		super(TemplateMode.HTML, dialectPrefix, NOME_TAG, true, null, false, PRECEDENCIA);	
	}

	@Override
	protected void doProcess(ITemplateContext context, IProcessableElementTag tag,
			IElementTagStructureHandler structureHandler) {
		
		IModelFactory modelFactory = context.getModelFactory();
		
		IAttribute page = tag.getAttribute("page");
		
		IModel model = modelFactory.createModel();
		
		model.add(modelFactory.createStandaloneElementTag("th:block"
				, "th:replace"
				, String.format("fragments/Paginacao :: pagination (%s)", page.getValue())));
		
		structureHandler.replaceWith(model, true);
		
	}

}
