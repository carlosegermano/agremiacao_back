package com.viracopos.socios.dto;

import java.io.Serializable;

import com.viracopos.socios.model.Socio;

public class SocioUpDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private String dataNascimento;
	private String email;
	private String timeQueTorce;
	private Integer numeroDaCamisa;
	private String dataDaAssociacao;
	private String status;
	private String senha;
	
	public SocioUpDTO() {}
	
	public SocioUpDTO(Socio socio) {
		super();
		this.id = socio.getId();
		this.nome = socio.getNome();
		this.dataNascimento = socio.getDataNascimento();
		this.email = socio.getEmail();
		this.timeQueTorce = socio.getTimeQueTorce();
		this.numeroDaCamisa = socio.getNumeroDaCamisa();
		this.dataDaAssociacao = socio.getDataDaAssociacao();
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

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTimeQueTorce() {
		return timeQueTorce;
	}

	public void setTimeQueTorce(String timeQueTorce) {
		this.timeQueTorce = timeQueTorce;
	}

	public Integer getNumeroDaCamisa() {
		return numeroDaCamisa;
	}

	public void setNumeroDaCamisa(Integer numeroDaCamisa) {
		this.numeroDaCamisa = numeroDaCamisa;
	}

	public String getDataDaAssociacao() {
		return dataDaAssociacao;
	}

	public void setDataDaAssociacao(String dataDaAssociacao) {
		this.dataDaAssociacao = dataDaAssociacao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
