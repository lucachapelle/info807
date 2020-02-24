import java.util.Scanner;

public class eLibre extends Etat {
    Scanner sc = new Scanner(System.in);

    public void acheter(Personnage p) {
        System.out.println("La case est libre");

        System.out.println("Voulez vous acheter la case? oui/non");
        String achat = sc.nextLine();
        if (achat.equals("oui")) {

            int prix = super.macase.getPrix();
            boolean ok = p.testSolde(prix);

            if (ok) {
                p.debiterCompte(prix);
                p.ajoutCaseAchetable(macase);
                System.out.println("La case est en votre possession!");
                if (super.macase.quartier.estConstructible(p)){
                    Etat e = new eConstructible();
                    e.setMacase(super.macase);
                    super.macase.setEtat(e);
               }else{
                    Etat e = new eAchete();
                    e.setMacase(super.macase);
                    super.macase.setEtat(e);
                }

            }
//    }
            else {
                System.out.println("Pas assez d'argent");
            }
        }else{
            System.out.println("Voulez n'avez pas acheter la case ");

        }
    }


    public void construction(Personnage nom) {
    }

    @Override
    public void payerLoyer(Personnage personnage) {
    }

}
