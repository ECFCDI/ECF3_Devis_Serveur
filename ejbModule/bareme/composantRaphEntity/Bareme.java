package bareme.composantRaphEntity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Bareme implements Serializable {

	/**
	 * Classe representant le barème de prix d' un produit.
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * Attributs  d' instances 
	 * @author Borges Correia Raphael 
	 * **/


	@Id
	private int refBareme;
	private String nomBareme;
//	@OneToOne
	private Produit produit;
	private float prixRevient;
	private float prixPriv;
	private float prixFr;
	private float prixEx;
	private float prixDi;
	private LocalDate dateCrea;










	// constructeur par defaut obligatoire pour les Entity sinon quand on veut recupere un objet de la base. plante
	public Bareme (){

	}

	// constructeur  : test: nous allons conserver les deux derniers constructeurs pour l' envoi au client
	public Bareme (int refBareme,String nomBareme,Produit produit, float prixRevient){

		setRefBareme(refBareme);
		setNomBareme(nomBareme);
		setProduit(produit);
		setPrixRevient(prixRevient);

	}




	// Constructeur qui sera utilisé aprés la couche service.
	public Bareme(int refBareme, String nomBareme, Produit produit, float prixRevient, float prixPriv, float prixFr,
			float prixEx, float prixDi,LocalDate dateCrea) {

		setRefBareme(refBareme);
		setNomBareme(nomBareme);
		setProduit(produit);
		setPrixRevient(prixRevient);
		setPrixPriv(prixPriv);
		setPrixFr(prixFr);
		setPrixEx(prixEx);
		setPrixDi(prixDi);
		setDateCrea(dateCrea);
	}







	//Getters and Setters 

	public int getRefBareme() {
		return refBareme;
	}
	public void setRefBareme(int refBareme) {
		this.refBareme = refBareme;
	}
	public String getNomBareme() {
		return nomBareme;
	}
	public void setNomBareme(String nomBareme) {
		this.nomBareme = nomBareme;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public float getPrixRevient() {
		return prixRevient;
	}
	public void setPrixRevient(float prixRevient) {
		this.prixRevient = prixRevient;
	}
	public float getPrixPriv() {
		return prixPriv;
	}
	public void setPrixPriv(float prixPriv) {
		this.prixPriv = prixPriv;
	}
	public float getPrixFr() {
		return prixFr;
	}
	public void setPrixFr(float prixFr) {
		this.prixFr = prixFr;
	}
	public float getPrixEx() {
		return prixEx;
	}
	public void setPrixEx(float prixEx) {
		this.prixEx = prixEx;
	}
	public float getPrixDi() {
		return prixDi;
	}
	public void setPrixDi(float prixDi) {
		this.prixDi = prixDi;
	}


	public LocalDate getDateCrea() {
		return dateCrea;
	}


	public void setDateCrea(LocalDate dateCrea) {
		this.dateCrea = dateCrea;
	}

	@Override
	public String toString() {
		return String.format(
				"Bareme [refBareme=%s, nomBareme=%s, produit=%s, prixRevient=%s, prixPriv=%s, prixFr=%s, prixEx=%s, prixDi=%s, dateCrea=%s]",
				refBareme, nomBareme, produit, prixRevient, prixPriv, prixFr, prixEx, prixDi, dateCrea);
	}




}
