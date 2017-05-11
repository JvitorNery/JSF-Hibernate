package br.com.fiap.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seqModalidade",sequenceName="seqModalidade",allocationSize=1)
public class Modalidade {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	private String nome;
	
	private String descricao;
	
	private boolean multiplayer;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isMultiplayer() {
		return multiplayer;
	}

	public void setMultiplayer(boolean multiplayer) {
		this.multiplayer = multiplayer;
	}

	public Modalidade(int codigo, String nome, String descricao, boolean multiplayer) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.multiplayer = multiplayer;
	}

	public Modalidade() {
		super();
	}
	
	
	
}
