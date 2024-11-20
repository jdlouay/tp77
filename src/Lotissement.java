

public class Lotissement implements GestionPropriete {
    protected Propriete[] tabProp;
    protected int nombre;


    public Lotissement(int n) {
        this.nombre = 0;
        this.tabProp = new Propriete[n];
    }


    public Propriete getProprieteByIndex(int i) {

        return tabProp[i];
    }


    public int getNbPieces() {
        int totalPieces = 0;
        for (int i = 0; i < nombre; i++) {
            if (tabProp[i] instanceof ProprietePrivee) {
                totalPieces ++;
            }
        }
        return totalPieces;
    }


    public void afficherProprietes() {

        for (int i = 0; i < nombre; i++) {
            System.out.println(tabProp[i].toString());
        }

    }


    public boolean ajouter(Propriete p) {
        if (nombre < MAX_PROPRIETES) {
            tabProp[nombre] = p;
            nombre++;
            return true;
        }
        return false;
    }


    public boolean supprimer(Propriete p) {
        for (int i = 0; i < nombre; i++) {
            if (tabProp[i].equals(p)) {
                for (int j = i; j < nombre - 1; j++) {
                    tabProp[j] = tabProp[j + 1];
                }
                tabProp[nombre - 1] = null;
                nombre--;
                return true;
            }
        }
        return false;
    }
}



