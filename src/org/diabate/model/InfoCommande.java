package org.diabate.model;

import java.util.Date;

public class InfoCommande {

	private Long idCommande;
	private Date dateCommande;
	private Double montant;
	private String adresseLivraison;
	
	public InfoCommande() {};

	public InfoCommande(Long idCommande, Date dateCommande, Double montant, String adresseLivraison) {
		super();
		this.idCommande = idCommande;
		this.dateCommande = dateCommande;
		this.montant = montant;
		this.adresseLivraison = adresseLivraison;
	}

	public Long getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Double getMontant() {
		return montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}

	public String getAdresseLivraison() {
		return adresseLivraison;
	}

	public void setAdresseLivraison(String adresseLivraison) {
		this.adresseLivraison = adresseLivraison;
	}

	@Override
	public String toString() {
		return "InfoCommande [idCommande=" + idCommande + ", dateCommande=" + dateCommande + ", montant=" + montant
				+ ", adresseLivraison=" + adresseLivraison + "]";
	};
	
	
	

}
