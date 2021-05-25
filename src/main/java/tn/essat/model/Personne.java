package tn.essat.model;

import java.io.Serializable;

public abstract class Personne implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private int id;
	private String nom;
	private String prenom;
	private String mail;
	private String adresse;
	private String tel;
	private String login;
	private String password;
	private String sexe;
	public Personne() {
			}
	
	public Personne(String nom, String prenom, String mail, String adresse, String tel, String login,
			String lpassword, String sexe) {
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.adresse = adresse;
		this.tel = tel;
		this.login = login;
		this.password = password;
		
		this.sexe = sexe;
	
	}

	public Personne(int id, String nom, String prenom, String mail, String adresse, String tel,
			String login,String password, String sexe) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.adresse = adresse;
		this.tel = tel;
		this.login= login;
		this.password = password;
		
		this.sexe = sexe;
		
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
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getlogin() {
		return login;
	}
	public void setlogin(String login) {
		this.login = login;
	}

	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return  prenom+" "+nom;
	}
	
}