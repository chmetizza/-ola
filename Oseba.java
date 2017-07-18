package si.rais;

import java.io.*;
import java.time.*;

/**
 * Created by spela on 10.7.2017.
 */
public class Oseba {
    private String priimek;
    private String ime;
    private LocalDate datumRojstva;
    private Spol spol;

    public Oseba(String priimek, String ime) {
        this.priimek = priimek;
        this.ime = ime;
    }

    public String getPriimek() { return priimek;  }

    public void setPriimek(String priimek) {

        this.priimek = priimek;
    }

    public String getIme() {

        return ime;
    }

    public void setIme(String ime) {

        this.ime = ime;
    }

    public LocalDate getDatumRojstva() {

        return datumRojstva;
    }

    public void setDatumRojstva(LocalDate datumRojstva) {

        this.datumRojstva = datumRojstva;
    }

    public int getAge(LocalDate birthDay){
        LocalDate today = LocalDate.now();
        Period p = Period.between(birthDay, today);
        int years = p.getYears();
        return years;
    }

    public Spol getSpol() {
        return spol;
    }

    public void setSpol(Spol spol) {
        this.spol = spol;
    }
}
