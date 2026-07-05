public class TestEntierNaturel {

    public static void main(String[] args) {

        try {
            EntierNaturel entier = new EntierNaturel(5);
            System.out.println("Valeur initiale : " + entier.getVal());

            // Décrémenter 6 fois pour générer l'exception
            for (int i = 0; i < 6; i++) {
                entier.decrementer();
                System.out.println("Après decrementer : " + entier.getVal());
            }

        } catch (NombreNegatifException e) {
            System.out.println("Exception capturée : " + e.getMessage());
            System.out.println("Valeur erronée : " + e.getValeurErronee());
        }

        try {
            EntierNaturel entier2 = new EntierNaturel(-3); // déclenche exception
        } catch (NombreNegatifException e) {
            System.out.println("Exception au constructeur : " + e.getMessage());
            System.out.println("Valeur erronée : " + e.getValeurErronee());
        }

        try {
            EntierNaturel entier3 = new EntierNaturel(2);
            entier3.setVal(-10); // déclenche exception
        } catch (NombreNegatifException e) {
            System.out.println("Exception au setVal : " + e.getMessage());
            System.out.println("Valeur erronée : " + e.getValeurErronee());
        }
    }
}