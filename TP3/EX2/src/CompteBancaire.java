public class CompteBancaire {

    protected String numero;
    protected double solde;
    protected String titulaire;

    public CompteBancaire(String numero, String titulaire, double soldeInitial) {
        this.numero = numero;
        this.titulaire = titulaire;
        this.solde = soldeInitial;
    }

    public void depot(double montant) {
        solde += montant;
        System.out.println(montant + "€ déposés sur le compte " + numero);
    }

    public void retrait(double montant) throws FondsInsuffisantsException {
        if (montant > solde) {
            throw new FondsInsuffisantsException(montant);
        }
        solde -= montant;
        System.out.println(montant + "€ retirés du compte " + numero);
    }

    public void afficherSolde() {
        System.out.println("Compte " + numero + " - Titulaire: " + titulaire + " - Solde: " + solde + "€");
    }

    public void transfert(CompteBancaire destinataire, double montant) throws FondsInsuffisantsException, CompteInexistantException {
        if (destinataire == null) {
            throw new CompteInexistantException("destinataire null");
        }
        this.retrait(montant);
        destinataire.depot(montant);
        System.out.println(montant + "€ transférés de " + this.numero + " vers " + destinataire.numero);
    }
}