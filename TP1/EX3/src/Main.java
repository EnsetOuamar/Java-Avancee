public class Main {

    public static void main(String[] args) {

        Voiture voiture = new Voiture("Voiture", 20000, "Peugeot 208", 2022);
        Moto moto = new Moto("Moto", 8000, "Yamaha", 600);
        Avion avion = new Avion("Avion", 5000000, "Air France", 900);

        voiture.emettreSon();
        voiture.afficherInformations();

        System.out.println();

        moto.emettreSon();
        moto.afficherInformations();

        System.out.println();

        avion.emettreSon();
        avion.afficherInformations();
    }
}