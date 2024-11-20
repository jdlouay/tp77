public  class ProprietePrivee extends Propriete {

    private int nbPieces;

    public ProprietePrivee(int id, Personne resonsable, String adresse, double surface, int nbPieces) {
        super(id, resonsable, adresse, surface);
        this.nbPieces = nbPieces;
    }

    public String toString() {
        return super.toString() + ", Nb Pièces=" + nbPieces + ", Impôts=" + calculImpot();
    }


    public double calculImpot() {
        return (50 * (getSurface() / 100)) + (10 * nbPieces);
    }

}


