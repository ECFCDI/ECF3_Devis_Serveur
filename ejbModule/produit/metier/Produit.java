package produit.metier;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import produit.utileDao.Utile;


//
@Entity
public abstract class Produit implements Serializable{
	
	@Id
	private int refProduit;
	private String designation;
	private String descriptif;
	private String statut;					//Le produit est référencé ou déreférencé
	private boolean isNeuf;					//Le produit est neuf ou d'occasion  - cet propriété a été rajouté car impossible de mapper l'heritage avec H2 pour le moment
	private LocalDate dateCreationFiche;
	
	private static final long serialVersionUID = 1L;
	
	public Produit() {
		super();
	}
	
	public Produit(String designation, LocalDate dateCreationFiche) {
		super();
		//this.refProduit = refProduit;
		this.designation =  Utile.nettoyerChaineToutEnMinuscule(designation);
		this.dateCreationFiche = dateCreationFiche;
	}

	public Produit(String designation, String descriptif, LocalDate dateCreationFiche) {
		super();
		//this.refProduit = refProduit;
		this.designation =  Utile.nettoyerChaineToutEnMinuscule(designation);
		this.descriptif =  Utile.nettoyerChaineToutEnMinuscule(descriptif);
		this.dateCreationFiche = dateCreationFiche;
	}

	public Produit(String designation, String descriptif, String statut, LocalDate dateCreationFiche) {
		super();
		//this.refProduit = refProduit;
		this.designation =  Utile.nettoyerChaineToutEnMinuscule(designation);
		this.descriptif =  Utile.nettoyerChaineToutEnMinuscule(descriptif);
		this.statut =  Utile.nettoyerChaineToutEnMinuscule(statut);
		this.dateCreationFiche = dateCreationFiche;
	}

	public int getRefProduit() {
		return refProduit;
	}

	public void setRefProduit(int refProduit) {
		this.refProduit = refProduit;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation =  Utile.nettoyerChaineToutEnMinuscule(designation);
	}

	public String getDescriptif() {
		return descriptif;
	}

	public void setDescriptif(String descriptif) {
		this.descriptif =  Utile.nettoyerChaineToutEnMinuscule(descriptif);
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut =  Utile.nettoyerChaineToutEnMinuscule(statut);
	}

	public boolean isNeuf() {
		return isNeuf;
	}

	public void setNeuf(boolean isNeuf) {
		this.isNeuf = isNeuf;
	}

	public LocalDate getDateCreationFiche() {
		return dateCreationFiche;
	}

	public void setDateCreationFiche(LocalDate dateCreationFiche) {
		this.dateCreationFiche = dateCreationFiche;
	}

	@Override
	public String toString() {
		return "Produit [refProduit=" + refProduit + ", designation=" + designation + ", descriptif=" + descriptif
				+ ", statut=" + statut + ", isNeuf=" + isNeuf + ", dateCreationFiche=" + dateCreationFiche + "]";
	}
	
	

}
