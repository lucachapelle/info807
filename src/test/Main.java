package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Monopoly monopoly = new Monopoly();
        Plateau plateau = new Plateau();
        ArrayList<Case> listeC = plateau.creeCase();
        Scanner sc = new Scanner(System.in);
        int jouerActuel = 0;
        int nbJ= 0;
        boolean quitter = true;
        boolean jouer = true;
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
                Personnage personnage = new Personnage(name, listeC.get(0));
                monopoly.ajouterPersonnage(personnage);
            }
            monopoly.choisirOrdre();
            monopoly.setJCourant();
        }

        while (quitter) {
            System.out.println("joueur actuel: " + monopoly.jCour.name);
            System.out.println("1. Jouer mon tour \n"
                    + "2. Acheter le terrain \n"
                    + "3. Construire sur ce terrain \n"
                    + "4. Passer mon tour \n"
                    + "5. Afficher liste des joueurs \n"
                    + "6. Afficher les cartes en sa possession \n"
                    + "7. Mettre fin a la partie");

            String str = sc.nextLine();
            switch (str) {

                case "1":

                    if(jouer == true){
                        jouer = false;
                        jouer(monopoly.jCour);
                } else{
                        System.out.println("Allez passe ton tour");
                    }

                    break;

                case "2":
                    System.out.println("Voulez vous acheter la case? oui/non");
                    String achat = sc.nextLine();
                    if (achat.equals("oui")) {
                        monopoly.jCour.achatCase();

                    }
                    break;

                case "3":
                    if ((monopoly.jCour.construire())) {
                        System.out.println("construction possible");
                    } else {
                        System.out.println("construction impossible");
                    }
                    break;

                case "4":
                    if (jouerActuel + 1< nbJ){
                        jouerActuel ++;
                    }else{
                        jouerActuel=0;
                    }
                    monopoly.setJSuivant(jouerActuel);
                    System.out.println("Au joueur suivant de jouer");

                    break;
                case "5":
                    System.out.println("Les joueurs presents sont:");
                    monopoly.afficheListeJoueur();

                    break;
                case "6":

                    monopoly.jCour.afficheListeCase();
                    break;
                case "7":

                    System.out.println("A bientot pour une nouvelle partie!");
                    quitter = false;
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
        System.out.println("Vous avez attérri sur la case " + j.c.name);
    }


}
