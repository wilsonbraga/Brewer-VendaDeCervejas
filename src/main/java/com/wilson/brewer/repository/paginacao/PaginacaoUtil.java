package com.wilson.brewer.repository.paginacao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

@Component
public class PaginacaoUtil {
	
	public void preparar(Criteria criteria, Pageable pageable){
		
		//calcular o total de pagina por linha para fazer a paginação com Pageable
				int paginaAtual = pageable.getPageNumber();//qual a pagina atual
				int totalRegistrosPorPagina = pageable.getPageSize();//pega o maximo de registro por pagina
				int primeiroRegistro = paginaAtual * totalRegistrosPorPagina;
				
				criteria.setFirstResult(primeiroRegistro);
				criteria.setMaxResults(totalRegistrosPorPagina); //maximo de registros por paginas
				
				//ordenacao da tabela por acendente e decresente  
				Sort sort = pageable.getSort();
				if(sort != null){
					Sort.Order order = sort.iterator().next();
					String propert = order.getProperty();
					criteria.addOrder(order.isAscending() ? Order.asc(propert) : Order.desc(propert));
				}	
		}
	
}
