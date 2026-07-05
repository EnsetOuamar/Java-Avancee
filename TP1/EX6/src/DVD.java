public class DVD implements Empruntable {

    private String titre;
    private String realisateur;
    private boolean emprunte;

    public DVD(String titre, String realisateur) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.emprunte = false;
    }

    public void emprunter() {
        if (!emprunte) {
            emprunte = true;
            System.out.println("Le DVD '" + titre + "' a été emprunté.");
        } else {
            System.out.println("Le DVD '" + titre + "' est déjà emprunté.");
        }
    }

    public void retourner() {
        if (emprunte) {
            emprunte = false;
            System.out.println("Le DVD '" + titre + "' a été retourné.");
        }
    }
}