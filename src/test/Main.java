import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static boolean fini = false;
    private static Scanner sc = new Scanner(System.in);
    private  static ArrayList<Case> listeC;
    private static Integer nbJ;
    private static Monopoly monopoly;
    private static int jouerActuel;
    private static Plateau plateau;


    public static void main(String[] args) throws Exception {
        monopoly = new Monopoly();
        plateau = new Plateau();
        listeC = plateau.creeCase();
        boolean quitter = true;
        while(!fini){
            creerPartie();
            menu();
        }
    }

    private static void creerPartie() {
        System.out.println("1. Lancer la partie");
        Integer begin = Integer.valueOf(sc.nextLine());

        if (1 == begin) {
            monopoly.lancerPartie();

            Depart caseD = plateau.getCaseDepart();

            System.out.println("Combien de joueurs pour cette partie? Entre 2 et 8 joueurs");
            Integer nbJoueurs = Integer.valueOf(sc.nextLine());
            nbJ = nbJoueurs;
            for (int i = 0; i < nbJoueurs; i++) {
                System.out.println("Quel est le nom du joueur?");
                String name = sc.nextLine();
                Personnage personnage = new Personnage(name, caseD);
                monopoly.ajouterPersonnage(personnage);
            }
            monopoly.choisirOrdre();
            monopoly.setJCourant();
            jouerActuel = monopoly.getIndice();
        }
    }

    private static void menu() {
        while (!fini) {
            System.out.println("c'est au tour de : " + monopoly.jCour.name + "  jouer");
            System.out.println("1. Jouer mon tour \n");
            System.out.println("2. Mettre fin a la partie \n ");
            String choix = sc.nextLine();
            switch (choix) {

                case "1":
                    jouer(monopoly.jCour);
                    break;
                case "2":
                    System.out.println("A bientot pour une nouvelle partie!");
                    fini = true;
                    break;
                default:
                    System.out.println("choix incorrect");
                    break;
            }
        }

    }


    private static void jouer(Personnage j) {
        int dé = j.lancerDes();
        j.avancerJoueur(dé);

        j.payerLoyer();
        j.achatCase();

        String achat = sc.nextLine();
        if (achat.equals("oui")) {
            monopoly.jCour.achatCase();

        }

        boolean fin_tour = false;
        while (!fin_tour) {
            System.out.println("1. Construire sur un terrain \n"
                    + "2. Afficher les cartes en sa possession \n"
                    + "3. Afficher le solde \n"
                    + "4. Afficher les joueurs \n"
                    + "5. Passer mon tour \n"
                    +".6. Mettre fin a la partie");

            String str = sc.nextLine();
            switch (str) {

                case "1":
                    monopoly.jCour.construire();
                    break;

                case "2":
                    monopoly.jCour.afficheListeCase();
                    break;

                case "3":
                    System.out.println(monopoly.jCour.porte_monnaie);
                    break;

                case "4":
                    System.out.println("Les joueurs presents sont:");
                    monopoly.afficheListeJoueur();
                    break;
                case "5":

                    if (jouerActuel + 1 < nbJ) {
                        jouerActuel++;
                    } else {
                        jouerActuel = 0;
                    }
                    monopoly.setJSuivant(jouerActuel);
                    System.out.println("Au joueur suivant de jouer");
                    fin_tour= true;
                    break;
                case "6":

                    System.out.println("A bientot pour une nouvelle partie!");
                    System.exit(0);

                    break;
                default:
                    System.out.println("choix incorrect");
                    break;
            }
        }
    }


}
