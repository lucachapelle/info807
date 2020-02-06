package test;

import javax.naming.Context;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Monopoly monopoly = new Monopoly();
        Plateau plateau = new Plateau();

        Scanner sc = new Scanner(System.in);
        boolean quitter = true;
        System.out.println("1. Lancer la partie");
        Integer begin = Integer.valueOf(sc.nextLine());
        if (1 == begin){
            monopoly.lancerPartie();
            System.out.println("Combien de joueurs pour cette partie?");
            Integer nbJoueurs = Integer.valueOf(sc.nextLine());
            for(int i =0; i< nbJoueurs; i++){
               System.out.println("Quel est le nom du joueur?");
               String name = sc.nextLine();
               Personnage personnage = new Personnage(name);
               monopoly.ajouterPersonnage(personnage);
            }
            plateau.getCaseDepart();
            monopoly.choisirOrdre();
            monopoly.setJCourant();
        }

        while (quitter) {

                System.out.println("1. Jouer mon tour \n"
                        + "2. Acheter un terrain \n"
                        + "3. Construire \n"
                        + "3. Payer un loyer \n");

                String str = sc.nextLine();
                switch (str) {

                    case "1":
                        System.out.println("ok");
                        String name = sc.nextLine();
                        break;

                    case "2":
                        monopoly.afficheListeJoueur();
                        break;

                    case "3":
                        break;
                    case "6":
                        System.out.println("A bientot pour une nouvelle partie!");
                        quitter = false;
                        break;
                    default:
                        System.out.println("choix incorrect");
                        break;
                }
            }
        }


    }

