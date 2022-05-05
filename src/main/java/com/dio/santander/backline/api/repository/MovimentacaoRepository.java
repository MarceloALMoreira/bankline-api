package com.dio.santander.backline.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.santander.backline.api.model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer> {

}
