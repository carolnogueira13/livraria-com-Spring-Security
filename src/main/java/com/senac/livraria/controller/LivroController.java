package com.senac.livraria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senac.livraria.service.LivroService;

@RestController
@RequestMapping(name = "api/livro")
public class LivroController {
	private LivroService livroService;

	public LivroController(LivroService livroService) {
		this.livroService = livroService;
	}
	
	
}
