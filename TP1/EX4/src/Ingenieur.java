public class Ingenieur extends Employe {

    private String specialite;

    public Ingenieur(String nom, String prenom, String email, String telephone, double salaire, String specialite) {
        super(nom, prenom, email, telephone, salaire);
        this.specialite = specialite;
    }

    public double calculerSalaire() {
        return salaire + (salaire * 0.15);
    }

    public String getSpecialite() {
        return specialite;
    }
}