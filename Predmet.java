package si.rais;

/**
 * Created by spela on 18.7.2017.
 */
public enum Predmet {
    SLO("Slovenščina"),
    ANG("Angleščina"),
    MAT("Matematika"),
    KEM("Kemija"),
    FIZ("Fizika"),
    GEO("Geografija"),
    ZGO("Zgodovina"),
    SV("Športna vzgoja"),
    LIK("Likovna vzgoja"),
    GLA("Glasbena vzgoja");

    private String nazivPred;

    Predmet(String predmet) {
        this.nazivPred = predmet;
    }

    public String getNazivPred(){
        return nazivPred;
    }
}
