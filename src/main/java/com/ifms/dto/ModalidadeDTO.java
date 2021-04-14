package com.ifms.dto;

import java.io.Serializable;

import com.ifms.entities.Modalidade;

public class ModalidadeDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private  long id;
	private String descricao;
	public ModalidadeDTO() { }
	public ModalidadeDTO(long id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}
	public ModalidadeDTO(Modalidade entity) {
		this.id = entity.getId();
		this.descricao = entity.getDescricao();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}

