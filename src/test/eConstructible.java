import java.util.Scanner;

public class eConstructible extends Etat  {
    private static Scanner sc = new Scanner(System.in);

    @Override
    public void acheter(Personnage nom) {

    }

    @Override
    public void construction(Personnage p) {
        int prix = super.macase.prixMaison;
        int nbM = super.macase.getNbMaison();
        System.out.println("Vous avez " + nbM + " : Maison (5 = hotels)");

        System.out.println("Le prix d'une maison est : " + prix + "\n Combien voulez vous en acheté max 5 ");

        int choix = Integer.parseInt(sc.nextLine());
        choix =   (choix > 5 ) && (0<= choix)? choix : 0;

        Personnage monProprio = super.macase.getProprietaire();

        int loyer = choix * prix;
        boolean ok = p.testSolde(loyer);

        if (ok) {
            p.debiterCompte(loyer);
            System.out.println("Vous avez payé " +loyer);
            super.macase.setNbMaison(nbM + choix);
            nbM = super.macase.getNbMaison();

            System.out.println("Vous avez mtn  " + nbM + " : Maison (5 = hotels)");

        }else{
            System.out.println("Vous n avez pas assez d'argent");
        }




        if(super.macase.getNbMaison() == 5){
            eFini efini = new eFini();
            efini.setMacase(super.macase);
            super.macase.setEtat(efini);
        }
    }

    @Override
    public void payerLoyer(Personnage personnage) {
        super.payerLoyer(personnage);
    }
}
