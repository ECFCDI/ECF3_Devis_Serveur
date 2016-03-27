/**
 * @author Herv� Michon
 */
package devis.dao;


import java.util.List;
import javax.ejb.Local;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.FlushModeType;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import devis.dao.interfaces.IDao;
import devis.entity.Devis;
import devis.entity.IdLigneDevis;
import devis.entity.LigneDevis;
import devis.ressources.ParametresClient;

@Singleton
@Local(IDao.class)
public class DaoDevis implements IDao {
	
	Devis DevisResultat = null;
	LigneDevis LigneDevisResultat = null;

	@PersistenceContext(unitName=ParametresClient.PERSISTENCE_UNIT)
	EntityManager 			em;
	EntityTransaction 		etx;

	/**
	 * Permet d'initialiser la connection et ouvre une transaction avec la base de donn�es 
	 */
	public void init() {
		em.setFlushMode(FlushModeType.AUTO); // pas obligatoire car AUTO est le mode donn� par d�faut
		etx = em.getTransaction();
		etx.begin();
	}
	
	/**
	 * Vide les tables de devis et lignes de devis (par cascade) de toutes leurs donn�es (r�serv� aux tests sur l'application)
	 */
	public void purge() {
		removeDeviss();
	}
		
	/**
	 * R�alise la transaction puis ferme la connection � la base de donn�es
	 */
	public void close() {
		etx.commit();
		em.close();	
	}
	
	/**
	 * Cr�� un devis dans la DAO
	 */
	@Override
	public void createDevis(Devis devis) {
		try {
			em.persist(devis);
		}
		catch (PersistenceException e) {
			e.printStackTrace();
			System.out.println("Une erreur non pr�vue s'est produite lors de la tentative de cr�ation du devis " + devis.getNumeroDevis());
		}
	}

	/**
	 * Supprime un devis dans la DAO
	 */
	@Override
	public void removeDevis(Devis devis) {
		Devis devis2Remove = em.find(Devis.class, devis.getNumeroDevis());
		em.remove(devis2Remove);
	}

	/**
	 * Met � jour un devis dans la DAO
	 */
	@Override
	public void updateDevis(Devis devis) {
		em.merge(devis);
	}

	
	/**
	 * Supprime tous les devis dans la DAO.<br>    
	 * Requ�te qui n'a de sens que pour l'�tude de cet ECF et la r�initialisation des donn�es,
	 *  une telle demande n'a pas de sens en milieu professionel
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void removeDeviss() {
		List<Devis> deviss = em.createQuery(ParametresClient.QUERY_ALL_DEVISS).getResultList();
		for (Devis eachDevis : deviss) 
		{
			em.remove(eachDevis);
		}
		
	}
	
	/**
	 * R�cup�re un devis dans la DAO
	 */
	@Override
	public Devis getDevis(Devis devis) {
		DevisResultat = em.find(Devis.class, devis.getNumeroDevis());
		return DevisResultat;
	}
	
	/**
	 * R�cup�re tous les devis pr�sents dans la DAO
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Devis> getDeviss() {
		return em.createQuery(ParametresClient.QUERY_ALL_DEVISS).getResultList();
	}

	/**
	 * Cr�� une ligne de devis dans la DAO
	 */
	@Override
	public void createLigneDevis(LigneDevis ligneDevis) {
		try {
			em.persist(ligneDevis);
		}
		catch (PersistenceException e) {
			IdLigneDevis idLigne = ligneDevis.getId();
			System.out.println("cr�ation impossible : il existe d�j� une ligne " +idLigne.getNumeroLigneDevis() + " dans le devis " + idLigne.getNumeroDevis());
		}
		
	}

	/**
	 * Supprime une ligne de devis dans la DAO
	 */
	@Override
	public void removeLigneDevis(LigneDevis ligneDevis) {
		
		LigneDevis devis2Remove = em.find(LigneDevis.class, ligneDevis.getId());
		em.remove(devis2Remove);
	}

	/**
	 * Met � jour une ligne de devis dans la DAO
	 */
	@Override
	public void updateLigneDevis(LigneDevis ligneDevis) {
		em.merge(ligneDevis);
	}

	/**
	 * Supprime toutes les lignes d'un devis dans la DAO
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void removeLignesDevis(Devis devis) {
		List<LigneDevis> lignesDevis = em.createQuery(ParametresClient.QUERY_ALL_LIGNES_DEVIS + devis.getNumeroDevis() + ParametresClient.QUERY_ALL_LIGNES_DEVIS_END ).getResultList();
		for (LigneDevis eachDevis : lignesDevis) 
		{
			em.remove(eachDevis);
		}
		
	}

	/**
	 * R�cup�re une ligne de devis dans la DAO
	 */
	@Override
	public LigneDevis getLigneDevis(LigneDevis ligneDevis) {
		LigneDevisResultat = em.find(LigneDevis.class, ligneDevis.getId());
		return LigneDevisResultat;
	}

	/**
	 * R�cup�re toutes les lignes d'un devis dans la DAO
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<LigneDevis> getLignesDevis(Devis devis) {
		List<LigneDevis> lignesDevis = em.createQuery(ParametresClient.QUERY_ALL_LIGNES_DEVIS + devis.getNumeroDevis() + ParametresClient.QUERY_ALL_LIGNES_DEVIS_END ).getResultList();
		return lignesDevis;
	}


}
