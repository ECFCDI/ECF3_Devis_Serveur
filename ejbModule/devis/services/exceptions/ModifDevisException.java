/**
 * @author Herv� Michon
 */
package devis.services.exceptions;

public class ModifDevisException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ModifDevisException() {
		
		String message = "erreur: ce devis ne peut pas �tre modifi� car il a d�j� �t� diffus�";
		System.out.println (message);
	}

}
