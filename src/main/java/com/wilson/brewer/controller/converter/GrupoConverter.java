package com.wilson.brewer.controller.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import com.wilson.brewer.model.Grupo;

public class GrupoConverter implements Converter<String, Grupo> {

	@Override
	public Grupo convert(String codigo) {
		if(!StringUtils.isEmpty(codigo)){
			Grupo Grupo = new Grupo();
			Grupo.setCodigo(Long.valueOf(codigo));		
			return Grupo;
		}
		
		return null;
	}

}
