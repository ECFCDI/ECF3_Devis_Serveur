package produit.metier;

import java.time.LocalDate;

public class ProduitOccasion extends Produit {

	
	private static final long serialVersionUID = 1L;

	public ProduitOccasion() {
		super();
		setNeuf(false);
	}
	
	public ProduitOccasion(String designation, LocalDate dateCreationFiche) {
		super(designation, dateCreationFiche);
		setNeuf(false);
	}

	public ProduitOccasion(String designation, String descriptif, LocalDate dateCreationFiche) {
		super(designation, descriptif, dateCreationFiche);
		setNeuf(false);
	}

	public ProduitOccasion(String designation, String descriptif, String statut, LocalDate dateCreationFiche) {
		super(designation, descriptif, statut, dateCreationFiche);
		setNeuf(false);
	}
}
