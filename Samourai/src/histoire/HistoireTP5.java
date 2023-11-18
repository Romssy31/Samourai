package histoire;

import personnages.Commercant;
import personnages.Ronin;
import personnages.Yakuza;
import personnages.Samourai;
import personnages.Traitre;

public class HistoireTP5 {
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", "thé", 20);
		Commercant chonin = new Commercant("Chonin", "thé", 40);
		Commercant kumi = new Commercant("Kumi", "thé", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Samourai akimoto =  new Samourai("Akimoto", "Miyamoto", "saké", 80);
		Traitre masako = new Traitre("Miyamoto", "Masako", "whisky", 100);

		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(kumi);
		marco.faireConnaissanceAvec(chonin);
		akimoto.faireConnaissanceAvec(marco);

		System.out.println("\n");
		
		masako.faireGentil(kumi);
		masako.ranconer(kumi);
		masako.ranconer(chonin);
		masako.ranconer(marco);
		akimoto.faireConnaissanceAvec(masako);
		masako.ranconer(kumi);
		masako.faireConnaissanceAvec(yaku);
		masako.faireGentil(yaku);
		masako.faireConnaissanceAvec(roro);
	}
}