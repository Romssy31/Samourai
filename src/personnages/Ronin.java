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
	
	 public int getHonneur() {
	        return honneur;
	    }
	 
	 public void provoquer(Yakuza adversaire) {
		 int force = 2 * honneur;
		 if (force >= adversaire.getReputation()) {
			 parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			 adversaire.perdre();
			 gagnerArgent(adversaire.getArgent());
			 parler("Je t’ai eu petit yakusa!");
			 } else {
				 int argentG = getArgent();
				 honneur--;
				 perdreArgent(getArgent());
				 parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
				 adversaire.gagner(argentG);
	        }
	    }
}
