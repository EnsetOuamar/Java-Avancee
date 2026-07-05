public class Commande {

    private double montantCommande;
    private Paiement moyenPaiement;

    public Commande(double montantCommande, Paiement moyenPaiement) {
        this.montantCommande = montantCommande;
        this.moyenPaiement = moyenPaiement;
    }

    public void processPayment() {
        moyenPaiement.effectuerPaiement(montantCommande);
    }
}