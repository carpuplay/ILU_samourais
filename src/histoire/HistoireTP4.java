package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Yazuka;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain humain = new Humain("Jean", "Coca", 10);

		humain.direBonjour();

		humain.acheter("café", 2);
		humain.acheter("marihuana tea", 100);
		
		Commercant mariano = new Commercant("Mariano", null, 0);
		mariano.direBonjour();
		mariano.seFaireExtorquer();
		mariano.recevoir(15);
		
		Yazuka yazuka = new Yazuka("Pepe", "Wiskey", 0, "Warsong", 0);
		yazuka.direBonjour();
		yazuka.extorquer(mariano);
	}

}
