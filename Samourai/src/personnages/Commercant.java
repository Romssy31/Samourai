package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, String boissonFav, int argent) {
		super(nom, boissonFav, argent);
	}
	
	public int seFaireExtorquer() {
		int argentVole = getArgent();
		perdreArgent(argentVole);
		parler("J’ai tout perdu! Le monde est trop injuste");
		return argentVole;
	}
	
	public void recevoirArgent(int argent) {
		gagnerArgent(argent);
		parler(argent + " sous ! Je te remercie généreux donateur!");
	}
}
