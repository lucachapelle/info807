public class eAchete extends Etat {
    public void acheter(Personnage nom) {
    }

    public void testSolde(Personnage nom) {
    }

    public void debiterCompte(Personnage nom) {
    }

    public void ajoutCaseAchetable(Case c) {
    }

    public void construction(Personnage nom) {
        System.out.println("Vous ne pouvez pas acheté ");

    }

    @Override
    public void payerLoyer(Personnage p) {
        super.payerLoyer(p);
    }

}
