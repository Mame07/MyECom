package org.diabate.model;

//import java.awt.Image;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.diabate.model.util.Couleur;
import org.diabate.model.util.Taille;

@Entity
public class Article {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idArticle;
	@Column(length = 50)
	private String categorie;
	@Column(length = 50)
	private String nom;
	@Column(length = 10)
	private String reference;
	@Enumerated (EnumType.STRING)
	private Couleur couleur;
	@Enumerated (EnumType.STRING)
	private Taille taille;
	private String photo;
	
	public Article() {};

	public Article(Long idArticle, String categorie, String nom, String reference, Couleur couleur, Taille taille,
			String photo) 
	{
		this.idArticle = idArticle;
		this.categorie = categorie;
		this.nom = nom;
		this.reference = reference;
		this.couleur = couleur;
		this.taille = taille;
		this.photo = photo;
	}

	public Article(String categorie, String nom, String reference, Couleur couleur, Taille taille) {
		this.categorie = categorie;
		this.nom = nom;
		this.reference = reference;
		this.couleur = couleur;
		this.taille = taille;
	}

	public Long getId() {
		return idArticle;
	}

	public void setId(Long idArticle) {
		this.idArticle = idArticle;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Couleur getCouleur() {
		return couleur;
	}

	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}

	public Taille getTaille() {
		return taille;
	}

	public void setTaille(Taille taille) {
		this.taille = taille;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "Article [idArticle = " + idArticle + ", categorie = " + categorie + ", nom = " + nom + ", reference = " + reference
				+ ", couleur = " + couleur + ", taille = " + taille + ", photo = " + photo + "]";
	};


}
