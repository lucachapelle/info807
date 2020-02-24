public abstract class Etat {
    public Achetable macase;

    public abstract void acheter(Personnage nom);

    public abstract void construction(Personnage nom);

    public Achetable getMacase() {
        return macase;
    }

    public void setMacase(Achetable macase) {
        this.macase = macase;
    }

    public void payerLoyer(Personnage personnage){
        Personnage monProprio = macase.getProprietaire();
        System.out.println("vous etes attéris sur la case a " + monProprio);

        int loyer = macase.getPrixLoyer();
        boolean ok = personnage.testSolde(loyer);

        if (ok) {
            personnage.debiterCompte(loyer);
            monProprio.porte_monnaie += loyer;
            System.out.println("Vous avez payé " +loyer+ " a " + monProprio);
        }
    }
}
