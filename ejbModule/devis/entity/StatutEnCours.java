/**
 * @author Herv� Michon
 */
package devis.entity;

import java.time.LocalDate;

import devis.services.CrudListDevis;
import devis.services.exceptions.NullDevisException;

public class StatutEnCours implements IStatut {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	CrudListDevis crudListDevis;

	public StatutEnCours(Devis devis) throws NullDevisException {
		if (devis == null) throw new NullDevisException();
		String message = "Devis " + devis.getNumeroDevis() + "pass� en statut 'en cours'";
		System.out.println(message);
	}

	@Override
	public void envoyerDevisClient(Devis devis) {
		System.out.println("Devis d�j� envoy� au client, nous le r��ditons");
	}

	@Override
	public void modifierDevis(Devis devis) {
		String message = "erreur: ce devis ne peut pas �tre modifi� car il a d�j� �t� diffus�";
		System.out.println (message);
	}

	@Override
	public void commanderDevis(Devis devis) {
		try{
			if (devis.getDateDevis().plusDays(90).isBefore(LocalDate.now())) {
				String message = "erreur: ce devis ne peut pas �tre command� il n'est plus valide";
				System.out.println (message);
				devis.setStatutDevis(new StatutPerime(devis));
			}
			else {
				devis.setStatutDevis(new StatutCommande(devis));
			}
		}
		catch (NullDevisException nde){}
	}


	@Override
	public void supprimerDevis(Devis devis) {
		String message = "erreur: ce devis ne peut pas �tre supprim� car il a d�j� �t� diffus�";
		System.out.println (message);

	}

}
