/**
 * @author Hervé Michon
 */

package devis.services.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import devis.entity.Devis;
import devis.entity.LigneDevis;
import devis.services.interfaces.ICrudListDevis;
import devis.services.interfaces.ICrudListLigneDevis;
import devis.services.interfaces.IServiceFacade;


@Stateless
@Remote(IServiceFacade.class)
public class ServiceFacade implements IServiceFacade {

	@EJB
	ICrudListDevis crudListDevis;
	
	@EJB
	ICrudListLigneDevis crudListLigneDevis;
	
	@Override
	public void createDevis(Devis devis) {
		crudListDevis.createDevis(devis);
	}

	@Override
	public void removeDevis(Devis devis) {
		crudListDevis.removeDevis(devis);
	}

	@Override
	public void updateDevis(Devis devis) {
		crudListDevis.updateDevis(devis);
	}

	@Override
	public void removeDeviss() {
		crudListDevis.removeDeviss();
	}

	@Override
	public Devis getDevis(Devis devis) {
		Devis searchDevis = crudListDevis.getDevis(devis);
		return searchDevis;
	}

	@Override
	public List<Devis> getDeviss() {
		List<Devis> deviss = crudListDevis.getDeviss();
		return deviss;
	}
	
	@Override
	public void copyDevis(Devis devis) {
		crudListDevis.copyDevis(devis);
	}
	
	
/*
	@Override
	public List<Devis> getDevissByXXXXXXX() {
		// TODO Auto-generated method stub
		return null;
	}
*/
	
	@Override
	public void createLigneDevis(LigneDevis ligneDevis) {
		crudListLigneDevis.createLigneDevis(ligneDevis);
	}

	@Override
	public void removeLigneDevis(LigneDevis ligneDevis) {
		crudListLigneDevis.removeLigneDevis(ligneDevis);
	}

	@Override
	public void updateLigneDevis(LigneDevis ligneDevis) {
		crudListLigneDevis.updateLigneDevis(ligneDevis);
	}

	@Override
	public void removeLignesDevis(Devis devis) {
		crudListLigneDevis.removeLignesDevis(devis);
	}

	@Override
	public LigneDevis getLigneDevis(LigneDevis ligneDevis) {
		LigneDevis searchLigneDevis = crudListLigneDevis.getLigneDevis(ligneDevis);
		return searchLigneDevis;
	}

	@Override
	public List<LigneDevis> getLignesDevis(Devis devis) {
		List<LigneDevis> lignesDevis = crudListLigneDevis.getLignesDevis(devis);
		return lignesDevis;
	}


	
}
