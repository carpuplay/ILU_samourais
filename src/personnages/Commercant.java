package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, String boissonPref, int qntArgentMax) {
		super(nom, "thé", 100);
	}

	public int seFaireExtorquer() {
		int argentVole = getQntArgent();
		perdreArgent(getQntArgent());
		parler("J’ai tout perdu! Le monde est trop injuste...");
		return argentVole;
	}

	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent + " sous! ! Je te remercie généreux donateur!");
		boire(getBoissonPref());
	}

	public static void main(String[] args) {
		Commercant mariano = new Commercant("Mariano", null, 0);
		mariano.direBonjour();
		mariano.seFaireExtorquer();
		mariano.recevoir(15);
	}
}
