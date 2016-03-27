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
import devis.services.interfaces.ICrudListDevis;


@Stateless
@Remote(ICrudListDevis.class)
public class CrudListDevis implements ICrudListDevis{

	@EJB
	IFacadeDao facadeDao;
	
	@Override
	public void createDevis(Devis devis) {
		facadeDao.createDevis(devis);
	}

	@Override
	public void removeDevis(Devis devis) {
		facadeDao.removeDevis(devis);
	}

	@Override
	public void updateDevis(Devis devis) {
		facadeDao.updateDevis(devis);
	}

	@Override
	public void removeDeviss() {
		facadeDao.removeDeviss();
	}

	@Override
	public Devis getDevis(Devis devis) {
		Devis searchDevis = facadeDao.getDevis(devis);
		return searchDevis;
	}

	@Override
	public List<Devis> getDeviss() {
		List<Devis> deviss = facadeDao.getDeviss();
		return deviss;
	}

	@Override
	public void copyDevis(Devis devis) {
		Devis modeleDevis = facadeDao.getDevis(devis);
		facadeDao.createDevis(modeleDevis);
		
	}

}
