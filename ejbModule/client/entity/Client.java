/**
 * @author Herve Michon
 * @version 1.0 03/03/2016
 * UC qui devait être traitée par un stagiaire qui a abandonné
 * sera complété au minima afin de rendre opérationnels les autres cas d'utilisation
 */

package client.entity;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Client implements Serializable {
	
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int idCli;
	private String raisonSociale;
	private String adresseCli;
	private Contact contact;
	private Etat etat;
	private TypeClient typeClient;
	private Ville ville;
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(int idCli, String raisonSociale, String adresseCli, Contact contact, Etat etat, TypeClient typeClient,
			Ville ville) {
		super();
		this.idCli = idCli;
		this.raisonSociale = raisonSociale;
		this.adresseCli = adresseCli;
		this.contact = contact;
		this.etat = etat;
		this.typeClient = typeClient;
		this.ville = ville;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getIdCli() {
		return idCli;
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public String getAdresseCli() {
		return adresseCli;
	}

	public Contact getContact() {
		return contact;
	}

	public Etat getEtat() {
		return etat;
	}

	public TypeClient getTypeClient() {
		return typeClient;
	}

	public Ville getVille() {
		return ville;
	}
	
	
	
	
	
	
}
