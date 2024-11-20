public class appartement extends ProprietePrivee{

private int numEtage ;

    public appartement(int id, Personne resonsable, String adresse, double surface, int nbPieces, int numEtage) {
        super(id, resonsable, adresse, surface, nbPieces);
        this.numEtage = numEtage;
    }

    public int getNumEtage() {
        return numEtage;
    }

    public void setNumEtage(int numEtage) {
        this.numEtage = numEtage;
    }

    @Override
    public String toString() {
        return "appartement{" +
                "numEtage=" + numEtage +
                '}';
    }
}
