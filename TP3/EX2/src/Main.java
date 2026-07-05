import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<CompteBancaire> comptes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choix = 0;

        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Ajouter un compte");
            System.out.println("2. Supprimer un compte");
            System.out.println("3. Dépôt");
            System.out.println("4. Retrait");
            System.out.println("5. Transfert");
            System.out.println("6. Afficher tous les comptes");
            System.out.println("7. Quitter");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();
            sc.nextLine();

            switch (choix) {
                case 1:
                    System.out.print("Numéro de compte : ");
                    String num = sc.nextLine();
                    System.out.print("Titulaire : ");
                    String titulaire = sc.nextLine();
                    System.out.print("Type de compte (1 = courant, 2 = épargne) : ");
                    int type = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Solde initial : ");
                    double soldeInit = sc.nextDouble();
                    sc.nextLine();

                    if (type == 1) {
                        System.out.print("Découvert autorisé : ");
                        double decouvert = sc.nextDouble();
                        sc.nextLine();
                        comptes.add(new CompteCourant(num, titulaire, soldeInit, decouvert));
                    } else {
                        System.out.print("Taux d'intérêt (%) : ");
                        double taux = sc.nextDouble();
                        sc.nextLine();
                        comptes.add(new CompteEpargne(num, titulaire, soldeInit, taux));
                    }
                    break;

                case 2:
                    System.out.print("Numéro du compte à supprimer : ");
                    String numSuppr = sc.nextLine();
                    CompteBancaire compteASuppr = trouverCompte(comptes, numSuppr);
                    if (compteASuppr != null) {
                        comptes.remove(compteASuppr);
                        System.out.println("Compte supprimé !");
                    } else {
                        System.out.println("Compte inexistant !");
                    }
                    break;

                case 3:
                    System.out.print("Numéro du compte : ");
                    String numDepot = sc.nextLine();
                    CompteBancaire compteDepot = trouverCompte(comptes, numDepot);
                    if (compteDepot != null) {
                        System.out.print("Montant à déposer : ");
                        double montant = sc.nextDouble();
                        sc.nextLine();
                        compteDepot.depot(montant);
                    } else {
                        System.out.println("Compte inexistant !");
                    }
                    break;

                case 4:
                    System.out.print("Numéro du compte : ");
                    String numRetrait = sc.nextLine();
                    CompteBancaire compteRetrait = trouverCompte(comptes, numRetrait);
                    if (compteRetrait != null) {
                        System.out.print("Montant à retirer : ");
                        double montant = sc.nextDouble();
                        sc.nextLine();
                        try {
                            compteRetrait.retrait(montant);
                        } catch (FondsInsuffisantsException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("Compte inexistant !");
                    }
                    break;

                case 5:
                    System.out.print("Numéro du compte source : ");
                    String numSource = sc.nextLine();
                    CompteBancaire source = trouverCompte(comptes, numSource);
                    System.out.print("Numéro du compte destinataire : ");
                    String numDest = sc.nextLine();
                    CompteBancaire dest = trouverCompte(comptes, numDest);
                    System.out.print("Montant du transfert : ");
                    double montant = sc.nextDouble();
                    sc.nextLine();

                    try {
                        if (source == null || dest == null) {
                            throw new CompteInexistantException((source == null ? numSource : numDest));
                        }
                        source.transfert(dest, montant);
                    } catch (FondsInsuffisantsException | CompteInexistantException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 6:
                    for (CompteBancaire c : comptes) {
                        c.afficherSolde();
                    }
                    break;

                case 7:
                    System.out.println("Au revoir !");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Choix invalide !");
            }
        }
    }

    private static CompteBancaire trouverCompte(ArrayList<CompteBancaire> comptes, String numero) {
        for (CompteBancaire c : comptes) {
            if (c.numero.equals(numero)) {
                return c;
            }
        }
        return null;
    }
}