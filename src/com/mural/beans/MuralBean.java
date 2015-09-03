package com.mural.beans;

import java.io.Serializable;

public class MuralBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nome;
	private String recado;
	
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRecado() {
		return this.recado;
	}
	public void setRecado(String recado) {
		this.recado = recado;
	}
	
	
}
