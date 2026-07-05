public class GestionPaiementApp {

    public static void main(String[] args) {

        Paiement carte = new CarteCredit("TX856", "9562-4520-9876-5432");
        Paiement paypal = new PayPal("TX456", "BA@mail.com");

        Commande commande1 = new Commande(150.0, carte);
        Commande commande2 = new Commande(500.0, paypal);

        commande1.processPayment();
        commande2.processPayment();
    }
}