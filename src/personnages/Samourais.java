package personnages;

public class Samourais extends Ronin{

	private String seigneur;
	
	public Samourais(String seigneur, String nom, String boissonPref, int qntArgentMax) {
		super(nom, boissonPref, qntArgentMax);
		this.seigneur = seigneur;
	}
	
	@Override
	public void direBonjour() {
		parler("Je suis fier de servir le seigneur " + seigneur + ".");
	}

}
