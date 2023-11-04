package histoire;
import personnages.Humain;

public class HistoireTP4 {
	public static void main(String[] args) {
	    Humain Prof = new Humain("Prof", "kombucha", 54);
	    Prof.direBonjour();
	    Prof.acheter("boisson", 12);
	    Prof.boire();
	    Prof.acheter("jeu", 2);
	    Prof.acheter("kimono", 50);
	  }
}
