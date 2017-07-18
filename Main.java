package si.rais;

import java.io.*;
import java.time.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Naziv naziv = new Naziv();
        naziv.setNaziv("OŠ Kolezija");

        System.out.println("Šola: " + naziv.getNaziv());

        Razrednik razrednik1 = new Razrednik("Ajdovec","Nataša", Razred.DVA_C);
        Razrednik razrednik2 = new Razrednik("Banfi","Žana", Razred.OSEM_A);

        razrednik2.setPredmeti(new Predmet[]{Predmet.MAT, Predmet.FIZ, Predmet.LIK});
        System.out.println(razrednik2.getIme() + " je razrednik " + razrednik2.getRazred().getRazredOznaka() + " razreda.");
        String poucuje = "";
        int stPred = razrednik2.getPredmeti().length;
        for(Predmet pred : razrednik2.getPredmeti()) {
            stPred = stPred - 1;
            if(stPred == 1){
                poucuje = poucuje + pred.getNazivPred() + " in ";
            }
            else if (stPred > 1) {
                poucuje = poucuje + pred.getNazivPred() + ", ";
            }
            else  {
                poucuje = poucuje + pred.getNazivPred();
            }
        }
        System.out.println("Poučuje predmete: " + poucuje);

        Ucenec ucenec1 = new Ucenec("Kalan", "Roza", Spol.F);
        Ucenec ucenec2 = new Ucenec("Mlakar", "Jaša", Spol.M);

        ucenec1.ocene(Predmet.SLO,Ocena.TRI);
        /*Oseba oseba = new Oseba();
        oseba.setIme("Jože");
        oseba.setPriimek("Tralala");
        System.out.println(oseba.getIme() + " " + oseba.getPriimek());
        LocalDate dateOfBirth = LocalDate.of(1979, 1, 12);
        oseba.setDatumRojstva(dateOfBirth);
        System.out.println(oseba.getDatumRojstva());*/
    }
}
