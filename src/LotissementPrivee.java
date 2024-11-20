public class LotissementPrivee extends Lotissement {


    public LotissementPrivee(int capacite) {
        super(capacite);
    }





    public boolean ajouter(Propriete p) {
        if (p instanceof ProprietePrivee) {
            return super.ajouter(p);
        }
        return false;
    }

    @Override
    public void afficherProprietes() {
        System.out.println("Lotissement Privé :");
        super.afficherProprietes();
    }




    public int getNbPieces() {
        int totalPieces = 0;
        for (int i = 0; i < nombre; i++) {
            if (tabProp[i] instanceof ProprietePrivee) {
                totalPieces ++;
            }
        }
        return totalPieces;
    }}

