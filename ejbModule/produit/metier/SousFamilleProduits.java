package produit.metier;

import javax.persistence.Entity;
import javax.persistence.Id;

import produit.utileDao.Utile;

@Entity
public class SousFamilleProduits {
	
	@Id
	private int refSousFamilleProduits;
	private String designation;
	
	private static final long serialVersionUID = 1L;

	public SousFamilleProduits() {
		super();
	}

	public SousFamilleProduits(String designation) {
		super();
		this.designation = Utile.nettoyerChaineToutEnMinuscule(designation);
	}

	public int getRefSousFamilleProduits() {
		return refSousFamilleProduits;
	}

	public void setRefSousFamilleProduits(int refSousFamilleProduits) {
		this.refSousFamilleProduits = refSousFamilleProduits;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = Utile.nettoyerChaineToutEnMinuscule(designation);
	}

	@Override
	public String toString() {
		return "SousFamilleProduits [refSousFamilleProduits=" + refSousFamilleProduits + ", designation=" + designation
				+ "]";
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
