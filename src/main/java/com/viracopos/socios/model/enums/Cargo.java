package com.viracopos.socios.model.enums;

public enum Cargo {

	PRESIDENTE(1, "ROLE_PRESIDENTE"),
	VICE_PRESIDENTE(2, "ROLE_VICE-PRESIDENTE"),
	DIRETOR(3, "ROLE_DIRETOR"),
	SOCIO(4, "ROLE_SOCIO");
	
	private int cod;
	private String descricao;
	
	private Cargo(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public static Cargo toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		
		for (Cargo x : Cargo.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}
