package com.cgi.hubtoswitch.dto;

public class Interface {
	private int id;
	private String nom;
	private String mac;
	private TypeIf typeif;
	private Materiel materiel;
	
	public Interface() {
		
	}
	
	public Interface(int id,String nom, String mac) {
	    this.id = id;
		this.nom = nom;
		this.mac = mac;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public TypeIf getTypeif() {
		return typeif;
	}
	public void setTypeif(TypeIf typeif) {
		this.typeif = typeif;
	}
	public Materiel getMateriel() {
		return materiel;
	}
	public void setMateriel(Materiel materiel) {
		this.materiel = materiel;
	}
}
