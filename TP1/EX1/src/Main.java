public class Main {

    public static void main(String[] args) {

        Adherent adherent = new Adherent("BA", "SIDI", "BASIDI@mail.com", "6905185210", 25, 1);

        Auteur auteur = new Auteur("ABDARAHMAN", "BA", "ABDARAHMAN@mail.com", "0742521052", 40, 10);

        Livre livre = new Livre(12345, "Les Miserables", auteur);

        System.out.println(adherent);
        System.out.println(livre);
    }
}