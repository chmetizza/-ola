package si.rais;

import java.io.*;
import java.time.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Naziv naziv = new Naziv();
        naziv.setNaziv("OŠ Kolezija");
        System.out.println(naziv.getNaziv());
        Oseba oseba = new Oseba();
        oseba.setIme("Jože");
        oseba.setPriimek("Tralala");
        System.out.println(oseba.getIme() + " " + oseba.getPriimek());
        LocalDate dateOfBirth = LocalDate.of(1979, 1, 12);
        oseba.setDatumRojstva(dateOfBirth);
        System.out.println(oseba.getDatumRojstva());
    }
}
