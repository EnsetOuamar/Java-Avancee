public class Livre implements Empruntable {

    private String titre;
    private String auteur;
    private boolean emprunte;

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.emprunte = false;
    }

    public void emprunter() {
        if (!emprunte) {
            emprunte = true;
            System.out.println("Le livre '" + titre + "' a été emprunté.");
        } else {
            System.out.println("Le livre '" + titre + "' est déjà emprunté.");
        }
    }

    public void retourner() {
        if (emprunte) {
            emprunte = false;
            System.out.println("Le livre '" + titre + "' a été retourné.");
        }
    }
}