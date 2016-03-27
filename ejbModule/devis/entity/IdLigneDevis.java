/**
 * @author Hervé Michon
 */
package devis.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;

/**
 * class technique pour identifier la clé multiple des lignes de devis
 * @author Hervé
 *
 */
@Embeddable
public class IdLigneDevis implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//@ManyToOne(optional = false)
	//@JoinColumn
	private int numeroDevis;
	private int numeroLigneDevis;

	public IdLigneDevis(int numeroDevis, int numeroLigneDevis) {
		super();
		this.numeroDevis = numeroDevis;
		this.numeroLigneDevis = numeroLigneDevis;
	}

	public IdLigneDevis() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNumeroDevis() {
		return numeroDevis;
	}

	public void setNumeroDevis(int numeroDevis) {
		this.numeroDevis = numeroDevis;
	}

	public int getNumeroLigneDevis() {
		return numeroLigneDevis;
	}

	public void setNumeroLigneDevis(int numeroLigneDevis) {
		this.numeroLigneDevis = numeroLigneDevis;
	}



}
