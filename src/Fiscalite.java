public class Fiscalite {

    public static void main(String[] args) {
        Personne p1 = new Personne(1, "Ali", "Ben Salah");
        Personne p2 = new Personne(2, "Mouna", "Sassi");
        Personne p3 = new Personne(3, "Ahmed", "Trabelsi");

        Lotissement lotissement = new Lotissement(10);

        lotissement.ajouter(new ProprietePrivee(1, p1, "Corniche", 350, 4));
        lotissement.ajouter(new Villa(2, p2, "Dar Chaabane", 400, 6, true));
        lotissement.ajouter(new appartement(3, p2, "Hammamet", 1200, 8, 3));
        lotissement.ajouter(new ProprieteProfessionnele(4, p3, "Korba", 1000, 50, true));
        lotissement.ajouter(new ProprieteProfessionnele(5, p1, "Bir Bouragba", 2500, 400, false));

        lotissement.afficherProprietes();


        LotissementPrivee lotissementPrivee = new LotissementPrivee(10);
        lotissementPrivee.ajouter(new ProprietePrivee(6, p1, "Sidi Bou Said", 500, 5));
        lotissementPrivee.ajouter(new Villa(7, p3, "Carthage", 600, 7, true));
        lotissementPrivee.afficherProprietes();
    }}