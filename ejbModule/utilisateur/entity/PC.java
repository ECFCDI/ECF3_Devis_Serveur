/**
 * @author Herve Michon
 * UC qui devait être traitée par un stagiaire qui a abandonné
 * sera complété au minima afin de rendre opérationnels les autres cas d'utilisation
 */
package utilisateur.entity;

import javax.persistence.Entity;

@Entity
abstract class PC extends Personnel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PC(int idPersonnel, String nomPersonnel, String prenom, int telPersonnel, String mailPersonnel) {
		super(idPersonnel, nomPersonnel, prenom, telPersonnel, mailPersonnel);
		// TODO Auto-generated constructor stub
	}

	public PC() {
		// TODO Auto-generated constructor stub
	}

}
