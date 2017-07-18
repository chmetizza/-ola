package si.rais;

import java.time.LocalDate;

/**
 * Created by spela on 18.7.2017.
 */
public class Ucenec extends Oseba {
    private Razred razred;

    public Ucenec(String priimek, String ime, Spol spol) {
        super(priimek, ime);
    }

    public Razred getRazred() {
        return razred;
    }

    public void setRazred(Razred razred) {
        this.razred = razred;
    }

    public void ocene(Predmet predmet, Ocena ocena){
        if(getSpol() == Spol.M) {
            System.out.println(getIme() + " je pri predmetu " + predmet.getNazivPred() + " dobil oceno " + ocena.getStOcena() + ".");
        }
        else {
            System.out.println(getIme() + " je pri predmetu " + predmet.getNazivPred() + " dobila oceno " + ocena.getStOcena() + ".");
        }
    }
}
