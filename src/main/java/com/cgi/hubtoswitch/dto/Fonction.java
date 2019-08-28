package com.cgi.hubtoswitch.dto;

public class Fonction {
	private int id;
	private String libelle;
	private Personne personne;
	private Client client;
	
	public Fonction() {
		
	}
	
	public Fonction(int id, String libelle) {
		
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

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
}
