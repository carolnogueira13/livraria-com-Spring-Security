package com.senac.livraria.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senac.livraria.entity.Categoria;
import com.senac.livraria.service.CategoriaService;

@RestController
@RequestMapping("api/categoria")
public class CategoriaController {
	private CategoriaService categoriaService;

	public CategoriaController(CategoriaService categoriaService) {
		this.categoriaService = categoriaService;
	}
	
	@GetMapping("listarCategorias")
	@CrossOrigin (origins = "*")
	public ResponseEntity<List<Categoria>> listarCategorias() {
		return ResponseEntity.ok(categoriaService.buscarCategorias()) ;
	}
	
}
