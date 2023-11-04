package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation; 
	
	public Yakuza(String nom, String boissonFav,int argent,String clan,int reputation) {
		super(nom, boissonFav, argent);
		this.clan = clan;
		this.reputation = 0;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int argentRecup = victime.getArgent();
		reputation ++;
		victime.seFaireExtorquer();
		parler("J’ai piqué les " + argentRecup +  " sous de Marco, ce qui me fait 45 sous dans ma poche. Hi ! Hi !");
		victime.perdreArgent(argentRecup);
	}
	
}
