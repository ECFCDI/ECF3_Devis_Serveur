/**
 * @author Herv� Michon
 */
package devis.entity;

import devis.services.CrudListDevis;
import devis.services.exceptions.NullDevisException;

public class StatutPerime implements IStatut {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	CrudListDevis crudListDevis;

	public StatutPerime(Devis devis) throws NullDevisException {
		if (devis == null) throw new NullDevisException();
		String message = "Devis " + devis.getNumeroDevis() + "pass� en statut 'p�rim�'";
		System.out.println(message);
	}

	@Override
	public void envoyerDevisClient(Devis devis) {
		String message = "Devis p�rim�, impossible de l'envoyer";
		System.out.println(message);
	}

	@Override
	public void modifierDevis(Devis devis) {
		String message = "erreur: ce devis ne peut pas �tre modifi� car il est p�rim�";
		System.out.println (message);
	}

	@Override
	public void commanderDevis(Devis devis) {
		String message = "erreur: ce devis est p�rim�";
		System.out.println (message);

	}



	@Override
	public void supprimerDevis(Devis devis) {
		String message = "erreur: ce devis ne peut pas �tre supprim� car il a d�j� �t� diffus�";
		System.out.println (message);

	}

}
