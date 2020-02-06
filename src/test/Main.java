package test;

import javax.naming.Context;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        boolean notBegin = true;
        Scanner sc = new Scanner(System.in);
        boolean quitter = true;
        int i = 0;
        while (quitter) {


            if (notBegin = false) {
                System.out.println("1. Jouer mon tour \n"
                        + "b. Construire \n"
                        + "c. \n");
                String str = sc.nextLine();


                switch (str) {

                    case "1":

                        break;

                    case "b":

                        break;

                    case "c":


                    default:
                        quitter = false;
                        System.out.println("choix inccorect");
                }
            }
        }


    }
}
