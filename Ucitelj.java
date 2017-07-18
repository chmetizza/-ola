package si.rais;

import java.time.LocalDate;

/**
 * Created by spela on 10.7.2017.
 */
public class Ucitelj extends Oseba {
    private Predmet[] predmeti;
    private Razred[] razredi;

    public Ucitelj(String priimek, String ime) {
        super(priimek, ime);
    }

    public Predmet[] getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(Predmet[] predmeti) {
        this.predmeti = predmeti;
    }

    public Razred[] getRazredi() {
        return razredi;
    }

    public void setRazredi(Razred[] razredi) {
        this.razredi = razredi;
    }
}
