/**
 * @author Hervé Michon
 */
package devis.entity;

import devis.services.CrudListDevis;
import devis.services.exceptions.NullDevisException;

public class StatutBrouillon implements IStatut {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	CrudListDevis crudListDevis;
	
	public StatutBrouillon(Devis devis) throws NullDevisException {
        if (devis == null) throw new NullDevisException();
        String message = "*** HM ** (Serveur) Devis " + devis.getNumeroDevis() + "passé en statut de brouillon" ;
        System.out.println(message);
	}

	@Override
	public void envoyerDevisClient(Devis devis) {
		try {
			devis.setStatutDevis(new StatutEnCours(devis));
		} catch (NullDevisException nde) {}
	}

	@Override
	public void modifierDevis(Devis devis) {
		crudListDevis.updateDevis(devis);		
	}

	@Override
	public void commanderDevis(Devis devis) {
    String message = "Devis " + devis.getNumeroDevis() + "doit être communiqué au client avant de pouvoir être commandé";
    System.out.println(message);
	}


	@Override
	public void supprimerDevis(Devis devis) {
		crudListDevis.removeDevis(devis);
		//TODO creer un EJB message pour avertir l'utilisateur que la suppression a bien été effectuee
		
	}

}
