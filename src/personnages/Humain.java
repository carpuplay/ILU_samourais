package personnages;

import java.util.Random;

public class Humain {
	private String nom;
	private String boissonPref;
	private int qntArgent;
	private int qntArgentMax = 100;

	public Humain(String nom, String boissonPref, int qntArgentMax) {
		this.nom = nom;
		this.boissonPref = boissonPref;
		this.qntArgentMax = qntArgentMax;
		this.qntArgent = genererQntArgent();
	}

	private int genererQntArgent() {
		Random random = new Random();
		qntArgent = random.nextInt(qntArgentMax + 1);
		return qntArgent;
	}

	private String getNom() {
		return nom;
	}

	public String getBoissonPref() {
		return boissonPref;
	}

	private int getQntArgent() {
		return qntArgent;
	}

	public void setQntArgent(int qntArgent) {
		this.qntArgent = qntArgent;
	}

	public void direBonjour() {
		parler("Bonjour! Je m'appelle" + nom + "et j’aime boire du" + boissonPref);
	}

	public void parler(String texte) {
		System.out.println("(" + nom + ")" + texte);
	}

	public void boire() {
		parler("Mmmm, un bon verre de" + boissonPref + "! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (prix < qntArgent) {
			parler("J'ai" + qntArgent + "sous en poche" + "Je vais pouvoir m'orir une boisson à" + prix + "sous");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + qntArgent + "sous en poche" + "Je ne peux même pas m'orir un" + bien + "à" + prix + "sous")
		}
	}

	private void gagnerArgent(int gain) {
		qntArgent += gain;
	}

	private void perdreArgent(int perte) {
		qntArgent -= perte;

	}
}
