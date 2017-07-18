package si.rais;

/**
 * Created by spela on 18.7.2017.
 */
public enum Spol {
    M("M"), F("Ž");

    private String sloSpol;

    Spol(String spol) {
        this.sloSpol = spol;
    }
    public String getSloSpol(){
        return sloSpol;
    }
}
