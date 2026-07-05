public class GestionBibliotheque {

    public static void main(String[] args) {

        Livre livre1 = new Livre("Les Miserables", "Victor Hugo");
        DVD dvd1 = new DVD("Inception", "Christopher Nolan");

        Utilisateur utilisateur1 = new Utilisateur("sidi");

        utilisateur1.emprunterObjet(livre1);
        utilisateur1.emprunterObjet(dvd1);

        livre1.retourner();
        dvd1.retourner();
    }
}