package personnages;

public class Ronin extends Humain{

	private int honneur;

	public Ronin(String nom, String boissonPref, int qntArgentMax, int honneur) {
		super(nom, boissonPref, qntArgentMax);
		this.honneur = 1;
	}
	
	public void donner(Commercant beneficiaire) {
		int donnation = (int) (getQntArgent() * 0.10) ; 
		parler(beneficiaire.getNom() + " prend ces " + donnation + " sous");
		beneficiaire.recevoir(donnation);
		perdreArgent(donnation);
	}
}
