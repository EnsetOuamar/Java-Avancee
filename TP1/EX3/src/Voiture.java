public class Voiture extends Vehicule {

    private String modele;
    private int annee;

    public Voiture(String nom, double prix, String modele, int annee) {
        super(nom, prix);
        this.modele = modele;
        this.annee = annee;
    }

    public void emettreSon() {
        System.out.println("La voiture vrombit.");
    }

    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("Modele: " + modele);
        System.out.println("Annee: " + annee);
    }
}