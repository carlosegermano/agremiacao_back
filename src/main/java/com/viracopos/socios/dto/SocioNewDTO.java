package com.viracopos.socios.dto;

import java.io.Serializable;

public class SocioNewDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private String nome;
	private String dataNascimento;
	private String email;	
	private String timeQueTorce;
	private Integer numeroDaCamisa;
	private String dataDaAssociacao;
	private String status;
	
	private Integer cidadeId;
	
	public SocioNewDTO() {
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

	public Integer getCidadeId() {
		return cidadeId;
	}

	public void setCidadeId(Integer cidadeId) {
		this.cidadeId = cidadeId;
	}

}
