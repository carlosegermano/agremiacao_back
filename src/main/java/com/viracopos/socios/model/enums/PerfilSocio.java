package com.viracopos.socios.model.enums;

public enum PerfilSocio {

	ADMIN(1, "ROLE_ADMIN"),
	SOCIO(2, "ROLE_SOCIO");
	
	private int cod;
	private String descricao;
	
	private PerfilSocio(int cod, String descricao) {
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
	
	public static PerfilSocio toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		
		for (PerfilSocio x : PerfilSocio.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
	
}
