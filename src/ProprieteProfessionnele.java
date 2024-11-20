public class ProprieteProfessionnele extends Propriete {
    private int nbEmployes;
    private boolean estEtatique;

    public ProprieteProfessionnele(int id, Personne resonsable, String adresse, double surface, int nbEmployes, boolean estEtatique) {
        super(id, resonsable, adresse, surface);
        this.nbEmployes = nbEmployes;
        this.estEtatique = estEtatique;
    }


    public String toString() {
        return super.toString() + ", Nb Employés=" + nbEmployes + ", Est Étatique=" + estEtatique + ", Impôts=" + calculImpot();
    }


    public double calculImpot() {
        if (estEtatique)
            return 0;

        else {
        return (100 * (getSurface() / 100)) + (30 * nbEmployes);
    }}


}
