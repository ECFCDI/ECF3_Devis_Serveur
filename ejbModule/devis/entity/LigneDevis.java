/**
 * @author Herve Michon
 * @version 1.0 03/03/2016
 */

package devis.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import bareme.composantRaphEntity.Bareme;

@Entity 
public class LigneDevis implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private IdLigneDevis idLigne;
	@ManyToOne
	private Bareme bareme;
	private int qte;
	private float remise;
	
	public LigneDevis(int numeroDevis, int numeroLigneDevis, Bareme bareme, int qte, float remise) {
		super();
		this.idLigne = new IdLigneDevis(numeroDevis,numeroLigneDevis);
		this.bareme = bareme;
		this.qte = qte;
		this.remise = remise;
	}

	public LigneDevis() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IdLigneDevis getId() {
		return idLigne;
	}

	public void setId(IdLigneDevis idLigne) {
		this.idLigne = idLigne;
	}

	public Bareme getBareme() {
		return bareme;
	}

	public void setBareme(Bareme bareme) {
		this.bareme = bareme;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public float getRemise() {
		return remise;
	}

	public void setRemise(float remise) {
		this.remise = remise;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	


	

		
	
	
}
