package org.diabate.model;

public class Utilisateur {
	
	private Long idUtilisateur;
	private String nom;
	private String prenom;
	private String email;
	private String motdepasse;
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
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", nom=" + nom + ", prenom=" + prenom + ", email="
				+ email + ", motdepasse=" + motdepasse + ", telephone=" + telephone + "]";
	};
	
	
	
	

}
