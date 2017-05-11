package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ModalidadeDAO;
import br.com.fiap.entity.Atleta;
import br.com.fiap.entity.Modalidade;

public class ModalidadeDAOImpl extends GenericDAOImpl<Modalidade, Integer>
implements ModalidadeDAO{

	public ModalidadeDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Modalidade> listar() {
		return em.createQuery("from Modalidade",
				Modalidade.class).getResultList();
	}

}
