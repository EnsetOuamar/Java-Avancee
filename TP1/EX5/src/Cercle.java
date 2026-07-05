public class Cercle extends Figure {

    private double rayon;

    public Cercle(String nom, double rayon) {
        super(nom);
        this.rayon = rayon;
    }

    public double calculerAire() {
        return Math.PI * rayon * rayon;
    }

    public double calculerPerimetre() {
        return 2 * Math.PI * rayon;
    }
}