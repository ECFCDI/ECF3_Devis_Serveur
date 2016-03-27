/**
 * @author Herve Michon
 * @version 1.0 03/03/2016
 */

package devis.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;

import client.entity.Client;
import devis.entity.StatutBrouillon;
import devis.services.exceptions.NullDevisException;
import utilisateur.entity.AC;

@Entity
public class Devis implements Serializable {
	
	/**
	 * numero de devis qui l'identifie de façon unique
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int numeroDevis;
	@ManyToOne
	private Client client;
	//@ManyToOne
	private AC assistante;
	//@ManyToOne
	private IStatut statutDevis;
	private LocalDate dateDevis;
	//@OneToMany (mappedBy="idLigne.numeroDevis")
	private ArrayList<LigneDevis> listeLigneDevis;
	private float totalHT;
	private float tva;
	
	
	LocalDate dateDuJour;
	
	
	//TODO vérifier de quels constructeurs j'ai besoin
	
	public Devis() throws NullDevisException {
		dateDuJour = LocalDate.now();
		this.dateDevis = dateDuJour;
		statutDevis = new StatutBrouillon(this);
	}
	
/**
 * méthode de construction d'un devis si l'assistante qui créé le devis est celle du commercial qui a la charge de la zone dans laquelle habite le client
 * @param numeroDevis
 * @param client
 * @param statutDevis
 * @param dateDevis
 * @param listeLigneDevis
 * @param totalHT
 * @param tva
 * @throws NullDevisException 
 */
	public Devis(int numeroDevis, Client client, LocalDate dateDevis,
			ArrayList<LigneDevis> listeLigneDevis, float totalHT, float tva) throws NullDevisException {
		super();
		this.numeroDevis = numeroDevis;
		this.client = client;
		this.statutDevis = new StatutBrouillon(this);
		dateDuJour = LocalDate.now();
		this.dateDevis = dateDuJour;
		this.listeLigneDevis = listeLigneDevis;
		this.totalHT = totalHT;
		this.tva = tva;
	}
	
/**
 *  méthode de construction d'un devis si l'assistante qui créé le devis n'est pas celle du commercial qui a la charge de la zone dans laquelle habite le client
 * @param numeroDevis
 * @param client
 * @param assistante assistante qui a créé le devis ou fait la dernière modification
 * @param statutDevis
 * @param dateDevis
 * @param listeLigneDevis
 * @param totalHT
 * @param tva
 * @throws NullDevisException 
 */
	public Devis(int numeroDevis, Client client, AC assistante, LocalDate dateDevis,
			ArrayList<LigneDevis> listeLigneDevis, float totalHT, float tva) throws NullDevisException {
		super();
		this.numeroDevis = numeroDevis;
		this.client = client;
		this.assistante = assistante;
		this.statutDevis = new StatutBrouillon(this);
		dateDuJour = LocalDate.now();
		this.dateDevis = dateDuJour;
		this.listeLigneDevis = listeLigneDevis;
		this.totalHT = totalHT;
		this.tva = tva;
	}


	public int getNumeroDevis() {
		return numeroDevis;
	}

	public void setNumeroDevis(int numeroDevis) {
		this.numeroDevis = numeroDevis;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public AC getAssistante() {
		return assistante;
	}

	public void setAssistante(AC assistante) {
		this.assistante = assistante;
	}

	public IStatut getStatutDevis() {
		return statutDevis;
	}

	public void setStatutDevis(IStatut statutDevis) {
		this.statutDevis = statutDevis;
	}

	public LocalDate getDateDevis() {
		return dateDevis;
	}

	public void setDateDevis(LocalDate dateDevis) {
		this.dateDevis = dateDevis;
	}

	public ArrayList<LigneDevis> getListeLigneDevis() {
		return listeLigneDevis;
	}

	public void setListeLigneDevis(ArrayList<LigneDevis> listeLigneDevis) {
		this.listeLigneDevis = listeLigneDevis;
	}

	public float getTotalHT() {
		return totalHT;
	}

	public void setTotalHT(float totalHT) {
		this.totalHT = totalHT;
	}

	public float getTva() {
		return tva;
	}

	public void setTva(float tva) {
		this.tva = tva;
	}

	public LocalDate getDateDuJour() {
		return dateDuJour;
	}

	public void setDateDuJour(LocalDate dateDuJour) {
		this.dateDuJour = dateDuJour;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	


		
	
	
}
