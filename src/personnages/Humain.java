package personnages;

import java.util.Random;

public class Humain {
	private String nom;
	private String boissonPref;
	private int qntArgent;
	private int qntArgentMax;
	private int nbConnaissances;
	private String[] memoire = new String[30];

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

	protected String getNom() {
		return nom;
	}

	public String getBoissonPref() {
		return boissonPref;
	}

	public int getQntArgent() {
		return qntArgent;
	}

	public void setQntArgent(int qntArgent) {
		this.qntArgent = qntArgent;
	}

	public void direBonjour() {
		parler("Bonjour! Je m'appelle " + nom + " et j’aime boire du " + boissonPref);
	}

	protected void parler(String texte) {
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
			parler("Je n'ai plus que " + qntArgent + " sous en poche. Je ne peux même pas m'offrir un " + bien + " à "
					+ prix + " sous");
		}
	}

	protected void gagnerArgent(int gain) {
		qntArgent += gain;
	}

	protected void perdreArgent(int perte) {
		qntArgent -= perte;

	}

	public void faireConnaissanceAvec(Humain humain2) {
		direBonjour();
		repondre(humain2);
		memoriser(humain2);
	}

	private void repondre(Humain humain) {
		humain.direBonjour();
		humain.memoriser(this);
	}

	private void memoriser(Humain humain) {
		String[] tempTab = new String[30];

		if (nbConnaissances < 3) {
			memoire[nbConnaissances] = humain.getNom();
			nbConnaissances++;

		} else {
			for (int i = 1; i < 2; i++) {
				tempTab[i] = memoire[i - 1];
				memoire[i-1] = tempTab[i];
			}

			memoire[0] = humain.getNom();
		}
	}
	
	private void listerConnaissance() {
		String message = "Je connais beaucoup de monde dont: ";
		
		for (int i = 0; i < 30 ; i++) {
			if (memoire[i] != null) {
				message += memoire[i] + ", ";
			}
		}
		
		parler(message);
	}

	public static void main(String[] args) {
		Humain robert = new Humain("Roberto", "Coca", 10);
		Humain manolo = new Humain("Manolo", "icedtea", 21);
		Humain sofi = new Humain("Sofi", "fanta", 11);
		Humain carla = new Humain("Carla", "lime", 30);
		Humain igor = new Humain("igor", "oreo", 40);

		robert.faireConnaissanceAvec(manolo);
		robert.faireConnaissanceAvec(sofi);
		robert.faireConnaissanceAvec(carla);
		System.out.println("\n");
		robert.listerConnaissance();
		robert.faireConnaissanceAvec(igor);
		robert.listerConnaissance();

	}
}
