package personnages;

public class Ronin extends Humain {
	private int honneur = 1;
	
	public Ronin (String nom,String boissonFav, int argent) {
		super(nom,boissonFav,argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int argentDonner = getArgent()/10;
		parler(beneficiaire.getNom() + " prend ces " + argentDonner + " sous");
		perdreArgent(argentDonner);
		beneficiaire.recevoirArgent(argentDonner);
	}
}
