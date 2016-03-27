/**
 * @author Herv� Michon
 */
package devis.entity;

import devis.services.CrudListDevis;
import devis.services.exceptions.NullDevisException;

public class StatutCommande implements IStatut {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	CrudListDevis crudListDevis;

	public StatutCommande(Devis devis) throws NullDevisException {
		if (devis == null) throw new NullDevisException();
		String message = "Devis " + devis.getNumeroDevis() + "pass� en statut 'command�'";
		System.out.println(message);
	}

	@Override
	public void envoyerDevisClient(Devis devis) {
		String message = "Devis d�j� command�, impossible de le renvoyer";
		System.out.println(message);
	}

	@Override
	public void modifierDevis(Devis devis) {
		String message = "erreur: ce devis ne peut pas �tre modifi� car il a d�j� �t� diffus�";
		System.out.println (message);
	}

	@Override
	public void commanderDevis(Devis devis) {
		String message = "erreur: ce devis a d�j� �t� command�";
		System.out.println (message);

	}


	@Override
	public void supprimerDevis(Devis devis) {
		String message = "erreur: ce devis ne peut pas �tre supprim� car il a d�j� �t� diffus�";
		System.out.println (message);

	}

}
