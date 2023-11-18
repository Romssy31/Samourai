package personnages;

public class Traitre extends Humain{
	private int niveauTraitrise = 0;
	private String seigneur;
	
	public Traitre (String seigneur, String nom, String boissonFav, int argent) {
		super(nom, boissonFav, argent);
		this.seigneur = seigneur;
	}
	
	@Override
	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + getNom() + " et j’aime boire du " + getBoisson());
		parler("Je suis fier de servir le seigneur " + seigneur + ".");
		parler("Mais je suis un traître et mon niveau de traîtrise est : "+  niveauTraitrise + ". Chut !");
	}
	
	public void ranconer(Commercant victime) {
		if (niveauTraitrise < 3) {
			int argentC = victime.getArgent(); 
			int argentV = (argentC * 2/10);
			victime.perdreArgent(argentV);
			gagnerArgent(argentV);
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne moi " + argentV + " sous ou gare a toi !");
			victime.parler("Tout de suite grand " + getNom() + " .");
			niveauTraitrise++;
		}
		else {
			parler("Mince je ne peux plus rançonner personne sinon un samourai risque de me desmasquer !");
		}
	}
	
	public void faireGentil(Humain ami) {
		if (nbConnaissance < 1) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif .");
		}
		else {
			int ar = argent;
			int don = (ar * 1/10);
			parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec " + ami.getNom() + " .");
			parler("Bonjour l'ami. Je voudrais vous aider en vous donnant " + don + " sous");
			ami.gagnerArgent(don);
			perdreArgent(don);
			ami.parler("Merci " + getNom() + " vous etes quelqu'un de bien");
			if(niveauTraitrise > 1) {
				niveauTraitrise--;
			}
		}
	}
}
