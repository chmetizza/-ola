package si.rais;

import java.io.*;
import java.time.*;

/**
 * Created by spela on 10.7.2017.
 */
public class Oseba {
    private String priimek;
    private String ime;
    LocalDate datumRojstva;

    public String getPriimek() {
        return priimek;
    }

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
}
