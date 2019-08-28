package com.cgi.hubtoswitch.dto;

public class Ville {
	private int id;
	private int codepostal;
	private String ville;
	
	public Ville() {
		
	}
	
	public Ville(int id,String ville, int codepostal) {
		this.id = id;
	    this.ville = ville;
	    this.codepostal = codepostal;
	    
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCodepostal() {
		return codepostal;
	}
	public void setCodepostal(int codepostal) {
		this.codepostal = codepostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
}
