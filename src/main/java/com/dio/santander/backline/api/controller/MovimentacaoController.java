package com.dio.santander.backline.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.backline.api.dto.NovaMovimentacao;
import com.dio.santander.backline.api.dto.NovoCorrentista;
import com.dio.santander.backline.api.model.Correntista;
import com.dio.santander.backline.api.model.Movimentacao;
import com.dio.santander.backline.api.repository.CorrentistaRepository;
import com.dio.santander.backline.api.repository.MovimentacaoRepository;
import com.dio.santander.backline.api.service.CorrentistaService;
import com.dio.santander.backline.api.service.MovimentacaoService;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {	
	@Autowired	
	private MovimentacaoRepository repository;	
	
	@Autowired
	private MovimentacaoService service;
	
	@GetMapping
	public List<Movimentacao> findAll(){
		return repository.findAll();
		
	}
	
	@PostMapping
	public void save(@RequestBody NovaMovimentacao movimentacao) {
		service.save(movimentacao);
		
	}
}


