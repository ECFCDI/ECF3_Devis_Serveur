package bareme.composantRaphEntity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Produit implements Serializable {

	/**
	 * 
	 */

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int refProduit;
	private String nom;
	private static final long serialVersionUID = 1L;

	public Produit(){

	}	

	public Produit(int refProduit, String nom) {
		super();
		this.refProduit = refProduit;
		this.nom = nom;
	}





	public int getRefProduit() {
		return refProduit;
	}
	public void setRefProduit(int refProduit) {
		this.refProduit = refProduit;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return String.format("Produit [refProduit=%s, nom=%s]", refProduit, nom);
	}




}
