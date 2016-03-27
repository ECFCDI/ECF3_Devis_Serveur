package produit.metier;

import java.time.LocalDate;

public class ProduitNeuf extends Produit {

	
	private static final long serialVersionUID = 1L;

	public ProduitNeuf() {
		super();
		setNeuf(true);
	}
	
	public ProduitNeuf(String designation, LocalDate dateCreationFiche) {
		super(designation, dateCreationFiche);
		setNeuf(true);
	}

	public ProduitNeuf(String designation, String descriptif, LocalDate dateCreationFiche) {
		super(designation, descriptif, dateCreationFiche);
		setNeuf(true);
	}

	public ProduitNeuf(String designation, String descriptif, String statut, LocalDate dateCreationFiche) {
		super(designation, descriptif, statut, dateCreationFiche);
		setNeuf(true);
	}
}
