/**
 * @author Herve Michon
 * @version 1.0 03/03/2016
 * UC qui devait être traitée par un stagiaire qui a abandonné
 * sera complété au minima afin de rendre opérationnels les autres cas d'utilisation
 */

package client.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ville implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int idVille;
	private String nomVille;
	private int cpVille;
	
	public Ville(int idVille, String nomVille, int cpVille) {
		super();
		this.idVille = idVille;
		this.nomVille = nomVille;
		this.cpVille = cpVille;
	}

	public Ville() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getIdVille() {
		return idVille;
	}

	public String getNomVille() {
		return nomVille;
	}

	public int getCpVille() {
		return cpVille;
	}


	
	
	
 
}
