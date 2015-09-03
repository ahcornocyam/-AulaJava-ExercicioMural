package com.mural.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class RecadosBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<MuralBean> recados;
	private MuralBean usuario;
	
	@PostConstruct
	public void start() {
		this.usuario = new MuralBean();
		this.recados =  new ArrayList<MuralBean>();	
	}


	public List<MuralBean> getRecados() {
		return this.recados;
	}


	public void setRecados(List<MuralBean> recados) {
		this.recados = recados;
	}


	public MuralBean getUsuario() {
		return this.usuario;
	}


	public void setUsuario(MuralBean usuario) {
		this.usuario = usuario;
	}
	
	public void registraRecado(){
		this.recados.add(usuario);
		this.usuario = new MuralBean();
	}

}
