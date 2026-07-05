public class CompteEpargne extends CompteBancaire {

    private double tauxInteret; // en %

    public CompteEpargne(String numero, String titulaire, double soldeInitial, double tauxInteret) {
        super(numero, titulaire, soldeInitial);
        this.tauxInteret = tauxInteret;
    }

    public void appliquerInterets() {
        double interets = solde * tauxInteret / 100;
        solde += interets;
        System.out.println("Intérêts de " + interets + "€ appliqués sur le compte épargne " + numero);
    }
}