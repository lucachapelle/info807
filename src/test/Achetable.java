public class Achetable extends Case {
    public Etat etat;
    boolean estAchetable = true;
    int prix = 100;
    int prixMaison=0;
    Personnage proprio;
    private int nbMaison;


    public Achetable(String nom, Case c, int prix) {
        super(nom, c, prix);
        Etat etat = new eLibre();
        etat.setMacase(this);
        this.etat = etat;
    }

    public Achetable(String name) {
        super(name);
        Etat etat = new eLibre();
        etat.setMacase(this);
        this.etat = etat;


    }

    public Achetable(String name, Case c) {
        super(name, c);
        Etat etat = new eLibre();
        etat.setMacase(this);
        this.etat = etat;

    }

    public boolean estAchetable() {
        return estAchetable;
    }

    public Personnage getProprietaire(){
        return this.proprio;
    }

    public int getNbMaison() {
        return nbMaison;
    }

    public void setNbMaison(int nbMaison) {
        this.nbMaison = nbMaison;
    }

    public int getPrix() {
        return prix;
    }

    public void acheter(Personnage personnage) {
        this.etat.acheter(personnage);
    }

    @Override
    public void setEtat(Etat e) {
        this.etat = e;
    }

    @Override
    public void payerLoyer(Personnage personnage) {
        this.etat.payerLoyer(personnage);
    }

    @Override
    public void construction(Personnage personnage) {

    }


    @Override
    public int getPrixLoyer() {
        int nbMaison = this.nbMaison;
        switch(nbMaison) {
            case 1:
                return this.getPrix()*5;
            case 2:
                return this.getPrix()*15;
            case 3:
                return this.getPrix() *45;
            case 4:
                return this.getPrix() *80;
            case 5:
                return this.getPrix()*100;
            default:
                return this.getPrix();
        }

    }


}
