package personnages;

public class Humain {
	private String nom;
	private String boissonFav;
	protected int argent;
	private Humain[] memoire = new Humain[30];
	protected int nbConnaissance;

	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boissonFav = boisson;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public String getBoisson() {
		return boissonFav;
	}

	public int getArgent() {
		return argent;
	}

	public void setArgent(int argent) {
		this.argent = argent;
	}

	public void parler(String texte) {
		System.out.println(getNom() + " - " + texte);
	}

	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + getBoisson());
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFav + " ! GLOUPS !");
	}

	public void gagnerArgent(int gain) {
		argent += gain;
	}

	public void perdreArgent(int perte) {
		argent -= perte;
	}

	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir un(e) " + bien + " à " + prix
					+ " sous");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir un(e) " + bien + " à "
					+ +prix + " sous.");
		}
	}

	private void ajouterAListeMemoire(Humain autreHumain) {
		if (nbConnaissance >= 30) {
			oublierPersonneLaPlusAncienne();
		}

		memoire[nbConnaissance] = autreHumain;
		nbConnaissance++;
	}

	private void oublierPersonneLaPlusAncienne() {
		int PersonneLaPlusAncienne = 0;
		for (int i = 1; i < memoire.length; i++) {
			if (memoire[i].nbConnaissance < memoire[PersonneLaPlusAncienne].nbConnaissance) {
				PersonneLaPlusAncienne = i;
			}
		}
		memoire[PersonneLaPlusAncienne] = null;
	}

	public void faireConnaissanceAvec(Humain autreHumain) {
		ajouterAListeMemoire(autreHumain);
		direBonjour();

		autreHumain.direBonjour();

		autreHumain.ajouterAListeMemoire(this);
	}

	public void listerConnaissance() {
		System.out.println(getNom() + " - " + "Je connais beaucoup de monde dont : ");
		for (Humain connaissance : memoire) {
			if (connaissance != null) {
				System.out.println("- " + connaissance.getNom());
			}
		}
	}
}