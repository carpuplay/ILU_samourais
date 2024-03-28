package personnages;

public class Yazuka extends Humain {

	private int reputation;
	private String clan;

	public Yazuka(String nom, String boissonPref, int qntArgentMax, String clan, int reputation) {
		super(nom, boissonPref, qntArgentMax);
		this.reputation = 0;
		this.clan = clan;
	}
	
	public int getReputation() {
		return reputation;
	}

	public void extorquer(Commercant commercant) {
		parler(" Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(commercant.getNom() + ", si tu tiens à la vie donne moi ta bourse ");
		int argentExtorque = commercant.seFaireExtorquer();
		gagnerArgent(argentExtorque);
		reputation++;
		parler(" J’ai piqué les " + argentExtorque + " sous de Marco, ce qui me fait " + getQntArgent()
				+ " sous dans ma poche. Hi ! Hi !");
	}

	public static void main(String[] args) {
		Yazuka yazuka = new Yazuka("Pepe", "Wiskey", 0, "Warsong", 0);
		yazuka.direBonjour();
		Commercant mariano = new Commercant("Mariano", null, 0);
		yazuka.extorquer(mariano);

	}
	
	public int perdre() {
		int fortunePerdu = getQntArgent();
		perdreArgent(fortunePerdu);
		reputation --;
		parler("J'ai perdu mdr");
		return fortunePerdu;
	}
	
	public void gagner(int gain) {
		gagnerArgent(gain);
		parler("J'ai gagné " + gain + "sous");
	}

}
