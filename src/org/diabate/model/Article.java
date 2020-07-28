package org.diabate.model;

import java.awt.Image;

public class Article {

	private Long idArticle;
	private String categorie;
	private String nom;
	private String reference;
	private Couleur couleur;
	private Taille taille;
	private Image photo;
	
	public Article() {};

	public Article(Long idArticle, String categorie, String nom, String reference, Couleur couleur, Taille taille,
			Image photo) 
	{
		this.idArticle = idArticle;
		this.categorie = categorie;
		this.nom = nom;
		this.reference = reference;
		this.couleur = couleur;
		this.taille = taille;
		this.photo = photo;
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

	public Image getPhoto() {
		return photo;
	}

	public void setPhoto(Image photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "Article [idArticle =" + idArticle + ", categorie =" + categorie + ", nom =" + nom + ", reference =" + reference
				+ ", couleur =" + couleur + ", taille =" + taille + ", photo =" + photo + "]";
	};


}
