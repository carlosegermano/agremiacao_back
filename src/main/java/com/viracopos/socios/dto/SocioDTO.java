package com.viracopos.socios.dto;

import java.io.Serializable;

import com.viracopos.socios.model.Cidade;
import com.viracopos.socios.model.Socio;

public class SocioDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private Cidade cidade;
	private String status;
	
	public SocioDTO() {}
	
	public SocioDTO(Socio socio) {
		super();
		this.id = socio.getId();
		this.nome = socio.getNome();
		this.cidade = socio.getCidade();
		this.status = socio.getStatus();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
