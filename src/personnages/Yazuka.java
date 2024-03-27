package personnages;

public class Yazuka extends Humain{

	private int reputation;
	private String clan;
	
	public Yazuka(String nom, String boissonPref, int qntArgentMax, String clan, int reputation) {
		super(nom, boissonPref, qntArgentMax);
		this.reputation = 0;
		this.clan = clan;
	}
	
	public void extorquer(Commercant commercant) {
		int argentExtorque = commercant.seFaireExtorquer();
		parler(" Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(commercant + ", si tu tiens à la vie donne moi ta bourse ");
		parler(" J’ai piqué les " + argentExtorque + " sous de Marco, ce qui me fait" + getQntArgent() + " sous dans ma\n"
				+ "poche. Hi ! Hi !");
	}
	
    public static void main(String[] args) {
    	Yazuka yakuza = new Yakuza("Pepe", null, 0) ;

    }
	
	
}
