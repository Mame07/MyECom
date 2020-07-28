package org.diabate.model;

import java.util.Collection;

public class CommandeFinale {
	
	private Utilisateur utilisateur;
	private Collection<Article> articles;
	private InfoCommande infoCommande;

	public CommandeFinale() {}

	
	public CommandeFinale(Utilisateur utilisateur, Collection<Article> articles, InfoCommande infoCommande) {
		super();
		this.utilisateur = utilisateur;
		this.articles = articles;
		this.infoCommande = infoCommande;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Collection<Article> getArticles() {
		return articles;
	}

	public void setArticles(Collection<Article> articles) {
		this.articles = articles;
	}

	public InfoCommande getInfoCommande() {
		return infoCommande;
	}

	public void setInfoCommande(InfoCommande infoCommande) {
		this.infoCommande = infoCommande;
	}

	@Override
	public String toString() {
		return "CommandeFinale [utilisateur=" + utilisateur + ", articles=" + articles + ", infoCommande="
				+ infoCommande + "]";
	};
	
	
}
