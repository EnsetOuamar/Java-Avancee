import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        MetierProduitImpl metier = new MetierProduitImpl();
        Scanner sc = new Scanner(System.in);
        int choix = 0;

        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Afficher la liste des produits");
            System.out.println("2. Rechercher un produit par id");
            System.out.println("3. Ajouter un nouveau produit");
            System.out.println("4. Supprimer un produit par id");
            System.out.println("5. Quitter");
            System.out.print("Votre choix: ");

            choix = sc.nextInt();
            sc.nextLine(); // consommer le retour à la ligne

            switch (choix) {
                case 1:
                    System.out.println("\nListe des produits :");
                    for (Produit p : metier.getAll()) {
                        System.out.println(p);
                    }
                    break;

                case 2:
                    System.out.print("Entrez l'id du produit: ");
                    long idRecherche = sc.nextLong();
                    sc.nextLine();
                    Produit p = metier.findById(idRecherche);
                    if (p != null) {
                        System.out.println("Produit trouvé: " + p);
                    } else {
                        System.out.println("Produit non trouvé !");
                    }
                    break;

                case 3:
                    System.out.print("ID: ");
                    long id = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Nom: ");
                    String nom = sc.nextLine();
                    System.out.print("Marque: ");
                    String marque = sc.nextLine();
                    System.out.print("Prix: ");
                    double prix = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Description: ");
                    String desc = sc.nextLine();
                    System.out.print("Stock: ");
                    int stock = sc.nextInt();
                    sc.nextLine();

                    Produit nouveau = new Produit(id, nom, marque, prix, desc, stock);
                    metier.add(nouveau);
                    break;

                case 4:
                    System.out.print("Entrez l'id du produit à supprimer: ");
                    long idSuppr = sc.nextLong();
                    sc.nextLine();
                    metier.delete(idSuppr);
                    break;

                case 5:
                    System.out.println("Au revoir !");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Choix invalide !");
            }
        }
    }
}