package com.cgi.hubtoswitch.dto;

public class Personne {
	private int id;
	private String nom;
	private String prenom;
	private String telephone;
	private String email;
	private Fonction fonction;
	private Client client;
	
	public Personne() {
		
	}
	
	public Personne(int id,String nom, String prenom) {
		
		this.id = id;
	    this.nom = nom;
	    this.prenom = prenom;
	    
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Fonction getFonction() {
		return fonction;
	}

	public void setFonction(Fonction fonction) {
		this.fonction = fonction;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
}
