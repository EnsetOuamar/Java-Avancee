public class FondsInsuffisantsException extends Exception {
    public FondsInsuffisantsException(double montant) {
        super("Fonds insuffisants pour effectuer l'opération : " + montant + "€");
    }
}
