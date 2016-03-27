/**
 * 
 * @author Herve Michon
 * @version 0.0 - 02/03/16 
 *
 */
package devis.ressources;

public class ParametresClient {
	
	/*Persistence pour travail en reseau sur JUNON*/
//	public final static String PERSISTENCE_UNIT = "HMPersistenceHibernate";
	/*Persistence pour travail en local sur portable*/
	public final static String PERSISTENCE_UNIT = "HMPersistenceHibernateXE";
	
	/*Attribution des noms de DAO qui seront utilis�es par l'application*/
	public final static String DAO1 = "DaoDevis";
	
	/*Attribution des noms des tables de la DAO dans lesqulles les donn�es sont stock�es*/
	public final static String TABLE_NAME = "ecf3_devis";
	public final static String TABLE_NAME2 = "ecf3_ligne_devis";
	
	
	//:\\ Syntaxe HQL s�lectionne tous les devis de la table tri�s par num�ro de devis //:\\
	public static final String QUERY_ALL_DEVISS= "select p from Devis p order by p.numeroDevis";
	
	//:\\ Syntaxe HQL s�lectionne toutes les lignes d'un devis de la table tri�s par num�ro de ligne//:\\
	public static final String QUERY_ALL_LIGNES_DEVIS = "select p from LigneDevis p where p.numeroDevis = ";
	public static final String QUERY_ALL_LIGNES_DEVIS_END = "order by p.numeroLigneDevis";


}
