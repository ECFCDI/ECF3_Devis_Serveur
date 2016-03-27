/**
 * @author Hervé Michon
 */

package devis.services;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import devis.dao.interfaces.IFacadeDao;
import devis.entity.Devis;
import devis.entity.LigneDevis;
import devis.services.interfaces.ICrudListLigneDevis;


@Stateless
@Remote(ICrudListLigneDevis.class)
public class CrudListLigneDevis implements ICrudListLigneDevis{

	@EJB
	IFacadeDao facadeDao;
	
	@Override
	public void createLigneDevis(LigneDevis ligneDevis) {
		facadeDao.createLigneDevis(ligneDevis);
	}

	@Override
	public void removeLigneDevis(LigneDevis ligneDevis) {
		facadeDao.removeLigneDevis(ligneDevis);
	}

	@Override
	public void updateLigneDevis(LigneDevis ligneDevis) {
		facadeDao.updateLigneDevis(ligneDevis);
	}

	@Override
	public void removeLignesDevis(Devis devis) {
		facadeDao.removeLignesDevis(devis);
	}

	@Override
	public LigneDevis getLigneDevis(LigneDevis ligneDevis) {
		LigneDevis searchLigneDevis = facadeDao.getLigneDevis(ligneDevis);
		return searchLigneDevis;
	}

	@Override
	public List<LigneDevis> getLignesDevis(Devis devis) {
		List<LigneDevis> lignesDevis = facadeDao.getLignesDevis(devis);
		return lignesDevis;
	}

}
