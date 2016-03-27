/**
 * @author Herve Michon
 * @version 1.0 03/03/2016
 */
package devis.dao.interfaces;

import java.util.List;

import devis.entity.Devis;
import devis.entity.LigneDevis;

/**
 * 
 * @author Herv�
 *D�claration de toutes les m�thodes � impl�menter dans la/les DAO utilis�es par l'application
 *@
 */
public interface IDao {


	
	/*Liste des m�thodes concernant le devis*/
	public void createDevis (Devis devis);
	public void removeDevis (Devis devis);
	public void updateDevis (Devis devis);
	public void removeDeviss();
	public Devis getDevis (Devis devis);
	public List<Devis> getDeviss();

//  liste des methodes de recherche sp�cifique � v�rifier et lister ici
//	public List<Devis> getSweetsByXXXXXX();
	
	/*Liste des m�thodes concernant les lignes du devis*/
	public void createLigneDevis (LigneDevis ligneDevis);
	public void removeLigneDevis (LigneDevis ligneDevis);
	public void updateLigneDevis (LigneDevis ligneDevis);
	public void removeLignesDevis(Devis devis);
	public LigneDevis getLigneDevis (LigneDevis ligneDevis);
	public List<LigneDevis> getLignesDevis(Devis devis);
	
	
}
