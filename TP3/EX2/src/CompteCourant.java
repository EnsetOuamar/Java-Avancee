public class CompteCourant extends CompteBancaire {

    private double decouvertAutorise;

    public CompteCourant(String numero, String titulaire, double soldeInitial, double decouvertAutorise) {
        super(numero, titulaire, soldeInitial);
        this.decouvertAutorise = decouvertAutorise;
    }

    @Override
    public void retrait(double montant) throws FondsInsuffisantsException {
        if (montant > solde + decouvertAutorise) {
            throw new FondsInsuffisantsException(montant);
        }
        solde -= montant;
        System.out.println(montant + "€ retirés du compte courant " + numero);
    }
}