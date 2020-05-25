package com.viracopos.socios.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

public class SocioNewDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@NotEmpty(message = "Preenchimento obrigatório!")
	private String nome;
	
	@NotEmpty(message = "Preenchimento obrigatório!")
	private String dataNascimento;
	
	private String email;
	
	@NotEmpty(message = "Preenchimento obrigatório!")
	private String timeQueTorce;
	
	@NotEmpty(message = "Preenchimento obrigatório!")
	private Integer numeroDaCamisa;
	
	@NotEmpty(message = "Preenchimento obrigatório!")
	private String dataDaAssociacao;
	
	@NotEmpty(message = "Preenchimento obrigatório!")
	private String status;
	
	@NotEmpty(message = "Preenchimento obrigatório!")
	private String senha;
	
	@NotEmpty(message = "Preenchimento obrigatório!")
	private Integer cidadeId;
	
	public SocioNewDTO() {
	}
	
	public SocioNewDTO(String nome, String dataNascimento, String email, String timeQueTorce, Integer numeroDaCamisa,
			String dataDaAssociacao, String status, Integer cidadeId) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.timeQueTorce = timeQueTorce;
		this.numeroDaCamisa = numeroDaCamisa;
		this.dataDaAssociacao = dataDaAssociacao;
		this.status = status;
		this.cidadeId = cidadeId;
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
	
	public Integer getCidadeId() {
		return cidadeId;
	}

	public void setCidadeId(Integer cidadeId) {
		this.cidadeId = cidadeId;
	}

}
