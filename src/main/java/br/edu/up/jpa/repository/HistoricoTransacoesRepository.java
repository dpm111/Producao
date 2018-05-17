package br.edu.up.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.up.jpa.dominio.HistoricoTransacoes;

public interface HistoricoTransacoesRepository extends CrudRepository<HistoricoTransacoes, Integer> {

	
}
