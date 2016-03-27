/**
 * @author Herve Michon
 * @version 1.0 03/03/2016
 * UC qui devait être traitée par un stagiaire qui a abandonné
 * sera complété au minima afin de rendre opérationnels les autres cas d'utilisation
 *  */

package client.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contact implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int IdContact;
	private String nomContact;
	private String prenomContact;
	private String telContact;
	private String mailContact;
	
	public Contact(int idContact, String nomContact, String prenomContact, String telContact, String mailContact) {
		super();
		IdContact = idContact;
		this.nomContact = nomContact;
		this.prenomContact = prenomContact;
		this.telContact = telContact;
		this.mailContact = mailContact;
	}

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getIdContact() {
		return IdContact;
	}

	public String getNomContact() {
		return nomContact;
	}

	public String getPrenomContact() {
		return prenomContact;
	}

	public String getTelContact() {
		return telContact;
	}

	public String getMailContact() {
		return mailContact;
	}


}
