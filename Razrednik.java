package si.rais;

import java.time.LocalDate;

/**
 * Created by spela on 18.7.2017.
 */
public class Razrednik extends Ucitelj {
    private Razred razred;

    public Razrednik(String priimek, String ime, Razred razred) {
        super(priimek, ime);
        this.razred = razred;
    }

    public Razred getRazred() {
        return razred;
    }

    public void setRazred(Razred razred) {
        this.razred = razred;
    }
}
