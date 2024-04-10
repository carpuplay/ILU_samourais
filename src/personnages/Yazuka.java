package personnages;

public class Yazuka extends Humain {

	private int reputation;
	private String clan;

	public Yazuka(String nom, String boissonPref, int qntArgentMax, String clan) {
		super(nom, boissonPref, qntArgentMax);
		this.reputation = 0;
		this.clan = clan;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	@Override
	public void direBonjour() {
		parler("Mon clan est celui de " + clan + ".");
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


	}
	
	public int perdre() {
		int fortunePerdu = getQntArgent();
		perdreArgent(fortunePerdu);
		reputation --;
		parler("J'ai perdu mdr" + fortunePerdu + " en moins...");
		return fortunePerdu;
	}
	
	public void gagner(int gain) {
		gagnerArgent(gain);
		parler("J'ai gagné " + gain + "sous");
	}

}
