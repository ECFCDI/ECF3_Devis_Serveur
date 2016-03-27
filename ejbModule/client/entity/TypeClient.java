/**
 * @author Herve Michon
 * @version 1.0 03/03/2016
 * UC qui devait être traitée par un stagiaire qui a abandonné
 * sera complété au minima afin de rendre opérationnels les autres cas d'utilisation
 */

package client.entity;

public enum TypeClient {

	FR ("Client France"),
	EX ("Client export"),
	DI ("Distributeur"),
	PR ("Client Privilegie");

	private String typeClient = "";

	TypeClient(String typeClient){
		this.typeClient = typeClient;
	}

	public String toString(){
		return typeClient;
	}
}	



