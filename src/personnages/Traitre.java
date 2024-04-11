package personnages;

public class Traitre extends Samourais {
	private int niveauTraitrise;

	public Traitre(String seigneur, String nom, String boissonPref, int qntArgentMax) {
		super(seigneur, nom, boissonPref, qntArgentMax);
		this.niveauTraitrise = 0;
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis niveau " + niveauTraitrise + " en traitre.");
	}

	public void ranconner(Commercant commercant) {
		int argentRanconner = commercant.getQntArgent() * 2 / 10;
	}
}
