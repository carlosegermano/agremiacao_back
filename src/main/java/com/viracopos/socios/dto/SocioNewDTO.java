package com.viracopos.socios.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

public class SocioNewDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@NotEmpty(message = "Preenchimento obrigatório!")
	@Length(min=5, max=120, message = "O nome deve possuir entre 5 e 120 caracteres!")
	private String nome;
	
	@NotEmpty(message = "Preenchimento obrigatório!")
	private String dataNascimento;
	
	@NotEmpty(message = "Preenchimento obrigatório!")
	@Length(min=4, max=12, message = "O nome de usuario deve possuir entre 4 e 12 caracteres!")
	private String usuario;
	
	@NotEmpty(message = "Preenchimento obrigatório!")
	private String timeQueTorce;
	
	@NotEmpty(message = "Preenchimento obrigatório!")
	private Integer numeroDaCamisa;
	
	@NotEmpty(message = "Preenchimento obrigatório!")
	private String dataDaAssociacao;
	
	private String status;
	
	private String cargo;
	
	@NotEmpty(message = "Preenchimento obrigatório!")
	private String senha;
	
	@NotEmpty(message = "Preenchimento obrigatório!")
	private Integer cidadeId;
	
	public SocioNewDTO() {
	}
	
	public SocioNewDTO(String nome, String dataNascimento, String usuario, String timeQueTorce, Integer numeroDaCamisa,
			String dataDaAssociacao, String status, String cargo, String senha, Integer cidadeId) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.usuario = usuario;
		this.timeQueTorce = timeQueTorce;
		this.numeroDaCamisa = numeroDaCamisa;
		this.dataDaAssociacao = dataDaAssociacao;
		this.status = (status == null) ? "Ativo" : status;
		this.cargo = cargo;
		this.senha = senha;
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

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
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

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
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
