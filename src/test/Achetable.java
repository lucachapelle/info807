package test;


public class Achetable extends Case {
    boolean estAchetable = false;
    int prix;

    public boolean estAchetable(Achetable a){
        if (a.estAchetable == estAchetable){
            return true;
        } else {return false;}
    }

    public int getPrix(){
        return prix;
    }
}
