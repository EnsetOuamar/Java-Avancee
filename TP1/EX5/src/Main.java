public class Main {

    public static void main(String[] args) {

        Cercle cercle = new Cercle("Cercle", 5);
        Rectangle rectangle = new Rectangle("Rectangle", 4, 6);

        cercle.afficherDetails();
        System.out.println();

        rectangle.afficherDetails();
    }
}