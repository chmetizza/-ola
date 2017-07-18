package si.rais;

/**
 * Created by spela on 18.7.2017.
 */
public enum Razred {
    ENA_A("1.A"),
    ENA_B("1.B"),
    DVA_A("2.A"),
    DVA_B("2.B"),
    DVA_C("2.C"),
    TRI_A("3.A"),
    TRI_B("3.B"),
    STIRI_A("4.A"),
    STIRI_B("4.B"),
    PET_A("5.A"),
    PET_B("5.B"),
    SEST_A("6.A"),
    SEST_B("6.B"),
    SEDEM_A("7.A"),
    SEDEM_B("7.B"),
    OSEM_A("8.A"),
    OSEM_B("8.B"),
    DEVET_A("9.A"),
    DEVET_B("9.B");

    private String oznaka;

    Razred(String razred){
        this.oznaka = razred;
    }

    public String getRazredOznaka() {
        return oznaka;
    }
}
