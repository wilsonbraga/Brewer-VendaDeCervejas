package com.algaworks.brewer.controller.page;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.web.util.UriComponentsBuilder;

public class PageWrapper<T> {
	
	//page abistrato 
	private Page<T> page; //Uma page é uma sub-lista de uma lista de objetos. Ele permite obter informações sobre a posição dele na lista inteira.
	
	
	//constroi a URI
	private UriComponentsBuilder uriBuilder;
	
	//Costrutor, page e  HttpServletRequest inicializarar com a Class
	public PageWrapper(Page<T> page, HttpServletRequest httpServletRequest ) {
		this.page = page;
		String httpUrl = httpServletRequest.getRequestURL().append(
				httpServletRequest.getQueryString() != null ? "?" + httpServletRequest.getQueryString() : "")
				.toString().replaceAll("\\+", "%20").replaceAll("excluido", "");
		this.uriBuilder = UriComponentsBuilder.fromHttpUrl(httpUrl);
	}
	
	//retorna o conteudo da página
	//estou usando na PesquisaCerveja
	public List<T> getConteudo(){
		return page.getContent();
	}
	
	// ver se é vazia é retorna true ou false
	//usando na PesquisaCerveja <tr th:if="${pagina.vazia}"> e th:if="${not pagina.vazia}"
	public boolean isVazia(){
		return page.getContent().isEmpty();
	}
	
	// retorna o número da pagina atual
	public int getAtual(){
		return page.getNumber();
		
	}
	
	// retorna um boolean true ou false, se for a primeira página = true
	//usando na PesquisaCerveja.html <li th:class="${pagina.primeira} ? disabled"> se for primeira pagina desabilita e em
	public boolean isPrimeira(){
		return page.isFirst();
	}
	
	// retorna um boolean true ou false, se for a primeira página = true
	//usando na PesquisaCerveja.html <li th:class="${pagina.ultima} ? disabled">, se for a ultima pagina desabilita
	public boolean isUltima(){
		return page.isLast();
	}
	
	//retorna o numero total de paginas
	public int getTotal(){
		return page.getTotalPages();
	}
	
	//cria uma url para o número de página
	//Pagina de PesquisaCervejas <a th:href="${pagina.urlParaPagina(numeroPagina)}">[[${p}]]</a>
	public String urlParaPagina(int pagina){
		
		/* 	replaceQueryParam(); 
		 *  Defina os valores do parâmetro de consulta
		 *  que SUBSTITUEM todos os valores de consulta
		 * 	EXISTENTE para o mesmo parâmetro.
		 * 
		 *  build(boolean encoded)uma UriComponentsinstância a partir dos
		 *  vários componentes contidos nesse construtor.
		 *  
		 *  encode()Solicitar que o modelo de URI seja pré-codificado no 
		 *  momento da criação e que as variáveis ​​de URI sejam codificadas 
		 *  separadamente quando expandidas.
		 *  
		 *  toUriString()Concatene todos os componentes URI para retornar
		 *   a string URI totalmente formada.
		 * */
		return uriBuilder.replaceQueryParam("page", pagina).build(true).encode().toUriString();
	}
	//ordenacao da tabela por acendente e  decresente  
	public String urlOrdenada(String propriedade){
		UriComponentsBuilder uriBuilderOrder = UriComponentsBuilder
				.fromUriString(uriBuilder.build(true).encode().toUriString());
		
		String valorSort = String.format("%s,%s", propriedade, inverterDirecao(propriedade));
		
		return uriBuilderOrder.replaceQueryParam("sort", valorSort).build(true).encode().toUriString();
	}
	
	
	public String inverterDirecao(String propriedade){
		String direcao = "asc";
		
		Order order = page.getSort() != null ? page.getSort().getOrderFor(propriedade) : null;
		//se tiver a Order inverte o que tem
		if (order != null){
			direcao = Sort.Direction.ASC.equals(order.getDirection()) ? "desc" : "asc";
		}	
		return direcao;
	}
	
	//icone de SKU e Nome para cima ou para baixo
	//chamando em pesquisaCerveja, th:remove="${pagina.ascendente('sku')} ? tag"
	public boolean ascendente(String propriedade){
		return inverterDirecao(propriedade).equals("asc");
	}
	
	//só quando precionar o SKU ou Nome que a ordenação aparece
	//chamando em Pesquisacerveja, th:if="${pagina.ordenada('sku')}"
	public boolean ordenada(String propriedade){
		Order order = page.getSort() != null ? page.getSort().getOrderFor(propriedade) : null;
		
		if(order == null){
			return false;
		}
		return page.getSort().getOrderFor(propriedade) !=  null ? true : false;
	}
	
	
	
}
