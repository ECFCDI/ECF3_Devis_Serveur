/**
 * @author Hervé Michon
 */
package devis.dao.facade;


import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import devis.dao.interfaces.IDao;
import devis.dao.interfaces.IFacadeDao;
import devis.entity.Devis;
import devis.entity.LigneDevis;
import devis.ressources.ParametresClient;


@Stateless
@Local(IFacadeDao.class)
public class FacadeDao implements IFacadeDao {
	
	
	@EJB(name = ParametresClient.DAO1)
	private IDao dao;
			
	
	@Override
	public void createDevis(Devis devis) {
		dao.createDevis(devis);
	}

	@Override
	public void removeDevis(Devis devis) {
		dao.removeDevis(devis);
		
	}

	@Override
	public void updateDevis(Devis devis) {
		dao.updateDevis(devis);
		
	}

	@Override
	public void removeDeviss() {
		dao.removeDeviss();
	}

	@Override
	public Devis getDevis(Devis devis) {
		Devis searchDevis = dao.getDevis(devis);
		return searchDevis;
	}

	@Override
	public List<Devis> getDeviss() {
		List<Devis> deviss = dao.getDeviss();
		return deviss;
	}

	@Override
	public void createLigneDevis(LigneDevis ligneDevis) {
		dao.createLigneDevis(ligneDevis);
	}

	@Override
	public void removeLigneDevis(LigneDevis ligneDevis) {
		dao.removeLigneDevis(ligneDevis);
	}

	@Override
	public void updateLigneDevis(LigneDevis ligneDevis) {
		dao.updateLigneDevis(ligneDevis);
	}

	@Override
	public void removeLignesDevis(Devis devis) {
		dao.removeLignesDevis(devis);
	}

	@Override
	public LigneDevis getLigneDevis(LigneDevis ligneDevis) {
		LigneDevis searchLigneDevis = dao.getLigneDevis(ligneDevis);
		return searchLigneDevis;
	}

	@Override
	public List<LigneDevis> getLignesDevis(Devis devis) {
		List<LigneDevis> lignesDevis = dao.getLignesDevis(devis);
		return lignesDevis;
	}


}
