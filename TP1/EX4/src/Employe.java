public abstract class Employe {

    protected String nom;
    protected String prenom;
    protected String email;
    protected String telephone;
    protected double salaire;

    public Employe() {
    }

    public Employe(String nom, String prenom, String email, String telephone, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.salaire = salaire;
    }

    public abstract double calculerSalaire();
}