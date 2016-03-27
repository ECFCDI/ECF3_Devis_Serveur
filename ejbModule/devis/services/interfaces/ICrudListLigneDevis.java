/**
 * @author Hervé Michon
 */
package devis.services.interfaces;

import java.util.List;

import devis.entity.Devis;
import devis.entity.LigneDevis;

public interface ICrudListLigneDevis {
	
	public void createLigneDevis (LigneDevis ligneDevis);
	public void removeLigneDevis (LigneDevis ligneDevis);
	public void updateLigneDevis (LigneDevis ligneDevis);
	public void removeLignesDevis(Devis devis);
	public LigneDevis getLigneDevis (LigneDevis ligneDevis);
	public List<LigneDevis> getLignesDevis(Devis devis);

}
