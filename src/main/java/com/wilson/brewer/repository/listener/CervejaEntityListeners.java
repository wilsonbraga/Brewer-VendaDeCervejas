package com.wilson.brewer.repository.listener;

import javax.persistence.PostLoad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.wilson.brewer.model.Cerveja;
import com.wilson.brewer.storage.FotoStorage;

public class CervejaEntityListeners {
	
	@Autowired
	private FotoStorage fotoStorage;
	
	@PostLoad
	public void postLoad(final Cerveja cerveja){
		SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
		cerveja.setUrlFoto(fotoStorage.getUrl(cerveja.getFotoOuSem()));
		cerveja.setUrlThumbnailFoto(fotoStorage.getUrl(FotoStorage.THUMBNAIL_PREFIX + cerveja.getFotoOuSem()));
	}
	
}
