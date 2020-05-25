package com.viracopos.socios.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;


@Entity
public class Socio implements Serializable {
	private static final long serialVersionUID = 1L;
			
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	
	private String dataNascimento;
	
	@Email
	@Column(unique=true)
	private String email;

	@ManyToOne
	@JoinColumn(name = "cidade_id")
	private Cidade cidade;
	
	private String timeQueTorce;
	
	private Integer numeroDaCamisa;

	private String dataDaAssociacao;
	
	private String status;
	
	public Socio() {}

	public Socio(Integer id, String nome, String dataNascimento, String email, String timeQueTorce,
			Integer numeroDaCamisa, String dataDaAssociacao, String status) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.timeQueTorce = timeQueTorce;
		this.numeroDaCamisa = numeroDaCamisa;
		this.dataDaAssociacao = dataDaAssociacao;
		this.status = status;
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

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
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
		return this.status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Socio other = (Socio) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}