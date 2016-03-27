/**
 * @author Herve Michon
 * UC qui devait �tre trait�e par un stagiaire qui a abandonn�
 * sera compl�t� au minima afin de rendre op�rationnels les autres cas d'utilisation
 */
package utilisateur.entity;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class TC extends PC implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private AC ac;
	
	public TC(int idPersonnel, String nomPersonnel, String prenom, int telPersonnel, String mailPersonnel) {
		super(idPersonnel, nomPersonnel, prenom, telPersonnel, mailPersonnel);
		// TODO Auto-generated constructor stub
	}

	public TC() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TC(int idPersonnel, String nomPersonnel, String prenom, int telPersonnel, String mailPersonnel, AC ac) {
		super(idPersonnel, nomPersonnel, prenom, telPersonnel, mailPersonnel);
		this.ac = ac;
	}

	public AC getAc() {
		return ac;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	



}
