package com.cgi.hubtoswitch.dto;

public class AdresseIp {
	private int id;
	private String ipV4;
	private String ipV6;
	private String masque;
	private Interface Interface;
	private TypeAffectation typeaffectation;
	
	public AdresseIp() {
		
	}
	
	public AdresseIp(int id,String ipV4, String masque) {
	    this.id = id;
		this.ipV4 = ipV4;
		this.masque = masque;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIpV4() {
		return ipV4;
	}
	public void setIpV4(String ipV4) {
		this.ipV4 = ipV4;
	}
	public String getIpV6() {
		return ipV6;
	}
	public void setIpV6(String ipV6) {
		this.ipV6 = ipV6;
	}
	public String getMasque() {
		return masque;
	}
	public void setMasque(String masque) {
		this.masque = masque;
	}

	public Interface getInterface() {
		return Interface;
	}

	public void setInterface(Interface interface1) {
		Interface = interface1;
	}

	public TypeAffectation getTypeaffectation() {
		return typeaffectation;
	}

	public void setTypeaffectation(TypeAffectation typeaffectation) {
		this.typeaffectation = typeaffectation;
	}
	
}
