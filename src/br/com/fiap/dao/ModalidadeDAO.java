package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.entity.Atleta;
import br.com.fiap.entity.Modalidade;

public interface ModalidadeDAO extends GenericDAO<Modalidade, Integer> {
	
	List<Modalidade> listar();
	
}
