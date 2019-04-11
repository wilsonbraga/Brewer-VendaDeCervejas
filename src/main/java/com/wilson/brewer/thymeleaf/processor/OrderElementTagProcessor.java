package com.wilson.brewer.thymeleaf.processor;

import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.model.IAttribute;
import org.thymeleaf.model.IModel;
import org.thymeleaf.model.IModelFactory;
import org.thymeleaf.model.IProcessableElementTag;
import org.thymeleaf.processor.element.AbstractElementTagProcessor;
import org.thymeleaf.processor.element.IElementTagStructureHandler;
import org.thymeleaf.templatemode.TemplateMode;

public class OrderElementTagProcessor extends AbstractElementTagProcessor{

	//mensagem custonizada <brewer:message/> do thymeleaf
	
	private static final String NOME_TAG = "order";
	private static final int PRECEDENCIA = 1000;
	
	public OrderElementTagProcessor(String dialecPrefix) {
		super(TemplateMode.HTML, dialecPrefix,NOME_TAG,true, null, false,PRECEDENCIA);
	
	}
	
	//metodo responsavel por criar 
	@Override
	protected void doProcess(ITemplateContext context, IProcessableElementTag tag,
			IElementTagStructureHandler structureHandler) {
		IModelFactory modelFactory = context.getModelFactory();
		
		/*pegando os campos que foram passado na PesquisaCerveja
		 * <brewer:order page="${pagina}" field="nome" text="Nome"/> */
		IAttribute page = 	tag.getAttribute("page");
		IAttribute field = 	tag.getAttribute("field");
		IAttribute text = 	tag.getAttribute("text");

		
		IModel model = modelFactory.createModel();
		model.add(modelFactory.createStandaloneElementTag("th:block"
				,"th:replace"
				,String.format("fragments/Ordenacao :: order (%s, %s, '%s')", page.getValue(), field.getValue(), text.getValue())));
		
		structureHandler.replaceWith(model, true);
		
	}
}
