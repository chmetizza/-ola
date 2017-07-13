package si.rais;

/**
 * Created by spela on 10.7.2017.
 */
public class Ucitelj extends Oseba {
    private String[] predmeti;

    public Ucitelj(String[] predmet) {
        this.predmeti = predmet;
    }

    public String[] getPredmet() {
        return predmeti;
    }

    public void setPredmet(String[] predmet) {
        this.predmeti = predmet;
    }
}
