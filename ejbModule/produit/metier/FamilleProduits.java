package produit.metier;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import produit.utileDao.Utile;

@Entity
public class FamilleProduits  implements Serializable{

	@Id
	private int refFamilleProduits;
	private String designation;
	
	private static final long serialVersionUID = 1L;
	
	public FamilleProduits() {
		super();
	}

	public FamilleProduits(String designation) {
		super();
		this.designation = Utile.nettoyerChaineToutEnMinuscule(designation);
	}

	public int getRefFamilleProduits() {
		return refFamilleProduits;
	}

	public void setRefFamilleProduits(int refFamilleProduits) {
		this.refFamilleProduits = refFamilleProduits;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = Utile.nettoyerChaineToutEnMinuscule(designation);
	}

	@Override
	public String toString() {
		return "FamilleProduits [refFamilleProduits=" + refFamilleProduits + ", designation=" + designation + "]";
	}
	
}
