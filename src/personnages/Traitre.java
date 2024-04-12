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
		
		if (niveauTraitrise < 3) {
			commercant.perdreArgent(argentRanconner);
			this.gagnerArgent(argentRanconner);
			niveauTraitrise ++;
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer!! Donne moi " + argentRanconner + " ou garde a toi!");
			commercant.parler("Tout de suite grand " + getNom() + " !");
			
		} else {
			parler("Mince je ne peux plus ranconner personne ou je vais me faire démasquer par un Samourai.");
		}
	}
		
	public void faireLeGentil() {
		if (nbConnaissances < 1 ) {
			parler("Je ne peux fair l'ami avec personne car je n'ai pa d'amis");
		} else {
			
		}
		
	}
}

