/**
 * @author Hervé Michon
 */
package devis.services.interfaces;

import java.util.List;

import devis.entity.Devis;

public interface ICrudListDevis {

	public void createDevis (Devis devis);
	public void removeDevis (Devis devis);
	public void updateDevis (Devis devis);
	public void removeDeviss();
	public void copyDevis(Devis devis);

	public Devis getDevis (Devis devis);
	public List<Devis> getDeviss();
	
}
