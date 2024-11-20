 public abstract class Propriete {
    private int id;
    private Personne resonsable;
    private String adresse;
    private double surface;


    @Override
    public String toString() {
        return "Propriete{" +
                "id=" + id +
                ", resonsable=" + resonsable +
                ", adresse='" + adresse + '\'' +
                ", surface=" + surface +
                '}';
    }

    public Personne getResonsable() {
        return resonsable;
    }

    public void setResonsable(Personne resonsable) {
        this.resonsable = resonsable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public Propriete(int id, Personne resonsable, String adresse, double surface) {
        this.id = id;
        this.resonsable = resonsable;
        this.adresse = adresse;
        this.surface = surface;


    }
    public abstract double calculImpot();




}

