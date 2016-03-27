/**
 * @author Hervé Michon
 */
package devis.services.exceptions;

public class NullDevisException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NullDevisException() {
		
	String message = "erreur: pas de devis transmis en paramètre";
	System.out.println (message);
	
	}

}
