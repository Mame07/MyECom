package org.diabate.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Utilisateur implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUtilisateur;
	@Column(length = 50)
	private String nom;
	@Column(length = 50)
	private String prenom;
	@Column(length = 50)
	private String email;
	@Column(length = 8)
	private String motdepasse;
	@Column(length = 10)
	private String telephone;
	
	public Utilisateur() {}

	public Utilisateur(Long idUtilisateur, String nom, String prenom, String email, String motdepasse,
			String telephone) 
	{
		this.idUtilisateur = idUtilisateur;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.motdepasse = motdepasse;
		this.telephone = telephone;
	}

	public Utilisateur(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public Utilisateur( String nom, String prenom, String email, String motdepasse,String telephone) 
	{
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.motdepasse = motdepasse;
		this.telephone = telephone;
	}

	public Long getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMotdepasse() {
		return motdepasse;
	}

	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur = " + idUtilisateur + ", nom = " + nom + ", prenom = " + prenom + ", email = "
				+ email + ", motdepasse = " + motdepasse + ", telephone = " + telephone + "]";
	};
	
	
	
	

}
