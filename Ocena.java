package si.rais;

/**
 * Created by spela on 18.7.2017.
 */
public enum Ocena {
    ENA("1"),
    DVA("2"),
    TRI("3"),
    STIRI("4"),
    PET("5");

    private String stOcena;

    Ocena(String ocena){
        this.stOcena = ocena;
    }
    public String getStOcena(){
        return stOcena;
    }
}
