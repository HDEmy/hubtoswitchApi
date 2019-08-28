package com.cgi.hubtoswitch.dto;

public class TypeIf {
	private int id;
	private String libelle;
	
	public TypeIf() {
		
	}
	
	public TypeIf(int id, String libelle) {
		
		this.id = id;
	    this.libelle = libelle;
	     
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
}
