/**
 * @author Herve Michon
 * @version 1.0 03/03/2016
 * UC qui devait �tre trait�e par un stagiaire qui a abandonn�
 * sera compl�t� au minima afin de rendre op�rationnels les autres cas d'utilisation
 */

package client.entity;

public enum Etat {

	OK ("OK"),
	DEB ("Debiteur"),
	BLK ("Blacklisted");
	
	private String etat = "";

	Etat(String etat){
		this.etat = etat;
	}

	public String toString(){
		return etat;
	}
}	
