package com.ade.model;

public class Fornite {
	
	private Plataform[] plataforms;
	
	public Fornite() {
		plataforms = new Plataform[4];
		plataforms[0] = new Plataform("PlayStation");
		plataforms[1] = new Plataform("Xbox");
		plataforms[2] = new Plataform("Nintendo Switch");
		plataforms[3] = new Plataform("Smartphone");
	}
	
	public Plataform[] getPlataforms() {
		return plataforms;
	}

}
