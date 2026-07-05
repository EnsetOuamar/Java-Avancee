public class CompteInexistantException extends Exception {
    public CompteInexistantException(String numero) {
        super("Le compte " + numero + " n'existe pas.");
    }
}