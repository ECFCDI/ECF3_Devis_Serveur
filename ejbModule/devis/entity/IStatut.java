/**
 * @author Herve Michon
 */

package devis.entity;

import java.io.Serializable;

import devis.services.CrudListDevis;

public interface IStatut extends Serializable {

	CrudListDevis crudListDevis= new CrudListDevis();
	
	public void envoyerDevisClient(Devis devis);
	public void modifierDevis(Devis devis);
	public void commanderDevis(Devis devis);

	public default void dupliquerDevis(Devis devis) {
		crudListDevis.copyDevis(devis);
	}
	
	public void supprimerDevis(Devis devis);
	
}
