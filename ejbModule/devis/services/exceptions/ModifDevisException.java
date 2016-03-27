/**
 * @author Hervé Michon
 */
package devis.services.exceptions;

public class ModifDevisException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ModifDevisException() {
		
		String message = "erreur: ce devis ne peut pas être modifié car il a déjà été diffusé";
		System.out.println (message);
	}

}
