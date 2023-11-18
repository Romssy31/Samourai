package histoire;
import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {
	public static void main(String[] args) {
	    Humain Prof = new Humain("Prof", "kombucha", 54);
	    Prof.direBonjour();
	    Prof.acheter("boisson", 12);
	    Prof.boire();
	    Prof.acheter("jeu", 2);
	    Prof.acheter("kimono", 50);
	    
	    System.out.println("\n");
	    
	    Commercant Marco = new Commercant("Marco", "thé", 20);
	    Marco.direBonjour();
	    Marco.seFaireExtorquer();
	    Marco.recevoirArgent(15);
	    Marco.boire();
	    
	    System.out.println("\n");
	    
	    Yakuza Yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
	    Yaku.direBonjour();
	    Yaku.extorquer(Marco);
	    
	    System.out.println("\n");
	    
	    Ronin Roro = new Ronin("Roro", "shochu", 60);
	    Roro.direBonjour();
	    Roro.donner(Marco);
	    
	    System.out.println("\n");
	    
	    Roro.provoquer(Yaku);
	  }
}
