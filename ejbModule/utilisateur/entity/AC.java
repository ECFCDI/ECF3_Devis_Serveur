/**
 * @author Herve Michon
 * UC qui devait �tre trait�e par un stagiaire qui a abandonn�
 * sera compl�t� au minima afin de rendre op�rationnels les autres cas d'utilisation 
 */
package utilisateur.entity;

public class AC extends PC {

	/**
	 * @
	 */
	private static final long serialVersionUID = 1L;

	public AC() {}
	
	public AC(int idPersonnel, String nomPersonnel, String prenom, int telPersonnel, String mailPersonnel) {
		super(idPersonnel, nomPersonnel, prenom, telPersonnel, mailPersonnel);
		// TODO Auto-generated constructor stub
	}

}
