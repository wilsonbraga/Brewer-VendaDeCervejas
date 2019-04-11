package com.wilson.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrosControler {
	
	@GetMapping("/404")
	public String paginaNaoEncontrada(){
		return "404";
	}
	
	@RequestMapping("/500")
	public String erroInterno(){
		return "500";
	}
	
	@RequestMapping("/sessao")
	public String sessionExp(){
		return "sessaoExpirada";
	}
}
