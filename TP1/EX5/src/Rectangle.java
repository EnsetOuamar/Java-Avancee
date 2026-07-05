public class Rectangle extends Figure {

    private double longueur;
    private double largeur;

    public Rectangle(String nom, double longueur, double largeur) {
        super(nom);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double calculerAire() {
        return longueur * largeur;
    }

    public double calculerPerimetre() {
        return 2 * (longueur + largeur);
    }
}