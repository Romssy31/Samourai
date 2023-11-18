package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boissonFav, int argent, String clan) {
		super(nom, boissonFav, argent);
		this.clan = clan;
	}

	public int getReputation() {
		return reputation;
	}

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int argentRecup = victime.getArgent();
		reputation++;
		victime.seFaireExtorquer();
		int argentT = getArgent() + argentRecup;
		parler("J’ai piqué les " + argentRecup + " sous de Marco, ce qui me fait " + argentT
				+ " sous dans ma poche. Hi ! Hi !");
		victime.perdreArgent(argentRecup);
		setArgent(argentT);
	}

	public void perdre() {
		int argent = getArgent();
		perdreArgent(getArgent());
		reputation--;
		parler("J’ai perdu mon duel et mes " + argent + " sous, snif... J'ai déshonoré le clan " + clan);
	}

	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation++;
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan " + clan + " ? Je l'ai dépouillé de ses "
				+ gain + " sous.");
	}
	
	@Override
	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + getNom() + " et j’aime boire du " + getBoisson());
		parler("Mon clan est celui de " + clan + ".");
	}
}