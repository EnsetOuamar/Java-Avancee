public class Main {

    public static void main(String[] args) {

        Ingenieur ingenieur = new Ingenieur(
                "ba",
                "sidi",
                "basidi@mail.com",
                "0695185210",
                3000,
                "Java"
        );

        Manager manager = new Manager(
                "vadily",
                "arafa",
                "sara@mail.com",
                "0700000000",
                4000,
                "Informatique"
        );

        System.out.println("Informations Ingenieur :");
        System.out.println("Nom: " + ingenieur.nom);
        System.out.println("Prenom: " + ingenieur.prenom);
        System.out.println("Specialite: " + ingenieur.getSpecialite());
        System.out.println("Salaire: " + ingenieur.calculerSalaire());

        System.out.println();

        System.out.println("Informations Manager :");
        System.out.println("Nom: " + manager.nom);
        System.out.println("Prenom: " + manager.prenom);
        System.out.println("Service: " + manager.getService());
        System.out.println("Salaire: " + manager.calculerSalaire());
    }
}