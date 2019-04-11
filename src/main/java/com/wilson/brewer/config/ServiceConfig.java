package com.wilson.brewer.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.wilson.brewer.service.CadastroCervejaService;
import com.wilson.brewer.storage.FotoStorage;

@Configuration
@ComponentScan(basePackageClasses = { CadastroCervejaService.class, FotoStorage.class})
public class ServiceConfig {
	
}
