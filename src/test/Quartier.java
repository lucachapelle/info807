import java.util.ArrayList;

public class Quartier {
    public String nom;

    public int nbCase;

    public ArrayList<Achetable>  listCase;

    public boolean estConstructible(Personnage p) {
        boolean res = true;
        for (Achetable a :listCase
             ) {

            res = res & p.apartient(a);
        }
        return res;
    }

    public void getCaseCartier() {
    }

}
