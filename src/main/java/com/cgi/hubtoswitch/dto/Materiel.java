package com.cgi.hubtoswitch.dto;

public class Materiel {

	private int id;
	private String libelle;
	private String numserie;
	private Client client;
	private TypeMateriel typemateriel;
	
	public Materiel() {
		
	}
	
	public Materiel(String libelle, String numserie) {
		
	    this.libelle = libelle;
	    this.numserie = numserie;
	    
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
	public String getNumserie() {
		return numserie;
	}
	public void setNumserie(String numserie) {
		this.numserie = numserie;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public TypeMateriel getTypemateriel() {
		return typemateriel;
	}

	public void setTypemateriel(TypeMateriel typemateriel) {
		this.typemateriel = typemateriel;
	}
	
	
}
