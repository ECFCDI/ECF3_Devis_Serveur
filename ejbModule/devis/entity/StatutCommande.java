/**
 * @author Hervé Michon
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
		String message = "Devis " + devis.getNumeroDevis() + "passé en statut 'commandé'";
		System.out.println(message);
	}

	@Override
	public void envoyerDevisClient(Devis devis) {
		String message = "Devis déjà commandé, impossible de le renvoyer";
		System.out.println(message);
	}

	@Override
	public void modifierDevis(Devis devis) {
		String message = "erreur: ce devis ne peut pas être modifié car il a déjà été diffusé";
		System.out.println (message);
	}

	@Override
	public void commanderDevis(Devis devis) {
		String message = "erreur: ce devis a déjà été commandé";
		System.out.println (message);

	}


	@Override
	public void supprimerDevis(Devis devis) {
		String message = "erreur: ce devis ne peut pas être supprimé car il a déjà été diffusé";
		System.out.println (message);

	}

}
