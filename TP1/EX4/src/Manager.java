public class Manager extends Employe {

    private String service;

    public Manager(String nom, String prenom, String email, String telephone, double salaire, String service) {
        super(nom, prenom, email, telephone, salaire);
        this.service = service;
    }

    public double calculerSalaire() {
        return salaire + (salaire * 0.20);
    }

    public String getService() {
        return service;
    }
}