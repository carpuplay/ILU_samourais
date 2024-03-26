package personnages;

import java.util.Random;

public class Humain {
	private String nom;
	private String boissonPref;
	private int qntArgent;
	private int qntArgentMax;

	public Humain(String nom, String boissonPref, int qntArgentMax) {
		this.nom = nom;
		this.boissonPref = boissonPref;
		this.qntArgentMax = 100;
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
		parler("Bonjour! Je m'appelle" + nom + "et j’aime boire du " + boissonPref);
	}

	public void parler(String texte) {
		System.out.println("(" + nom + ") " + texte);
	}

	public void boire(String boisson) {
		parler("Mmmm, un bon verre de " + boisson + "! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (prix < qntArgent) {
			parler("J'ai " + qntArgent + " sous en poche " + "Je vais pouvoir m'orir une boisson à " + prix + " sous");
			boire(bien);
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + qntArgent + " sous en poche. Je ne peux même pas m'offrir un " + bien + " à " + prix + " sous");
		}
	}

	private void gagnerArgent(int gain) {
		qntArgent += gain;
	}

	private void perdreArgent(int perte) {
		qntArgent -= perte;

	}
	
    public static void main(String[] args) {
        Humain humain = new Humain("Jean", "Coca", 10);

        humain.direBonjour(); 
 
        humain.acheter("café", 2); 
        humain.acheter("marihuana tea", 100);

    }
}
