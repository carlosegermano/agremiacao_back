package com.viracopos.socios.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.viracopos.socios.model.Socio;

public class SocioUpDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
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
	
	@NotEmpty(message = "Preenchimento obrigatório!")
	private String senha;
	
	public SocioUpDTO() {}
	
	public SocioUpDTO(Socio socio) {
		super();
		this.id = socio.getId();
		this.nome = socio.getNome();
		this.dataNascimento = socio.getDataNascimento();
		this.usuario = socio.getUsuario();
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
