package personnages;

public class Humain {
	private String nom;
	  private String boissonFav;
	  private int argent;

	  public Humain(String nom, String boisson, int argent){
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

	  public void parler(String texte) {
	    System.out.println(getNom() + " - " + texte);
	  }

	  public void direBonjour() {
	    parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + getBoisson() );
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

	  public void acheter(String bien,int prix) {
	    if (argent >= prix) {
	      parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir un(e) " + bien + " à " + prix + " sous");
	      perdreArgent(prix);
	    }
	    else {
	      parler("Je n'ai plus que " + argent +" sous en poche. Je ne peux même pas m'offrir un(e) " + bien +  " à " +
	          + prix +" sous.");
	    }
	  }
}
