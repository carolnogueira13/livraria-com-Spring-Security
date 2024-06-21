package com.senac.livraria.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.senac.livraria.entity.Livro;
import com.senac.livraria.repository.LivroRepository;

@Service
public class LivroService {
	
	private LivroRepository livroRepository;

	public LivroService(LivroRepository livroRepository) {
		this.livroRepository = livroRepository;
	}
	
	public List<Livro> buscarLivros(){
		return livroRepository.findAll();
	}
}
