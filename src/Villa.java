public class Villa extends ProprietePrivee {
    private boolean avecPiscine;

    public Villa(int id, Personne responsable, String adresse, double surface, int nbPieces, boolean avecPiscine) {
        super(id, responsable, adresse, surface, nbPieces);
        this.avecPiscine = avecPiscine;
    }



    public double calculImpot() {
        double base = super.calculImpot();
        if (avecPiscine) {
            return base + 200;
        }
        return base;
    }


    @Override
    public String toString() {
        return super.toString() + ", Avec Piscine=" + avecPiscine;
    }
}
