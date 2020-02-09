package test;


public class Achetable extends Case {
    boolean estAchetable = true;
    int prix = 100;

    public Achetable(String nom, Case c, int prix) {

        super(nom, c, prix);
    }

    public Achetable(String name) {
        super(name);
    }

    public Achetable(String name, Case c) {
        super(name, c);
    }

    public boolean estAchetable() {
        return estAchetable;
    }

    public int getPrix() {
        return prix;
    }
}
