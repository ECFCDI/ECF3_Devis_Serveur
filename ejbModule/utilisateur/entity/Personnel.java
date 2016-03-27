/**
 * @author Herve Michon
 * UC qui devait être traitée par un stagiaire qui a abandonné
 * sera complété au minima afin de rendre opérationnels les autres cas d'utilisation
 */
package utilisateur.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public abstract class Personnel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int idPersonnel;
	private String nomPersonnel;
	private String prenom;
	private int telPersonnel;
	private String mailPersonnel;
	
	public Personnel() {}
	
	
	public Personnel(int idPersonnel, String nomPersonnel, String prenom, int telPersonnel, String mailPersonnel) {
		super();
		this.idPersonnel = idPersonnel;
		this.nomPersonnel = nomPersonnel;
		this.prenom = prenom;
		this.telPersonnel = telPersonnel;
		this.mailPersonnel = mailPersonnel;
	}

	public int getIdPersonnel() {
		return idPersonnel;
	}

	public String getNomPersonnel() {
		return nomPersonnel;
	}

	public String getPrenom() {
		return prenom;
	}

	public int getTelPersonnel() {
		return telPersonnel;
	}

	public String getMailPersonnel() {
		return mailPersonnel;
	}
	
	
		
}
