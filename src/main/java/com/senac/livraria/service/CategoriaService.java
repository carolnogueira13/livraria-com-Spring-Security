package com.senac.livraria.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.senac.livraria.entity.Categoria;
import com.senac.livraria.repository.CategoriaRepository;

@Service
public class CategoriaService {

	private CategoriaRepository categoriaRepository;

	public CategoriaService(CategoriaRepository categoriaRepository) {
		this.categoriaRepository = categoriaRepository;
	}

	public List<Categoria> buscarCategorias (){
		return categoriaRepository.findAll();
	}
}
