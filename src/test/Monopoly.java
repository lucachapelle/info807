package test;


import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class Monopoly {
    public Personnage jCour;
    ArrayList<Personnage> listJoueur = new ArrayList<>();

    public void lancerPartie() {
        new Monopoly();
    }

    public void choisirOrdre() {
        Collections.shuffle(listJoueur);
    }

    public void ajouterPersonnage(Personnage personnage) {
        listJoueur.add(personnage);
    }

    public void afficheListeJoueur() {
        for (Personnage elem : listJoueur) {
            System.out.println("nom " + elem.name);
            System.out.println("argent " + elem.porte_monnaie);

        }
    }

    public void setJCourant() {
        this.jCour = listJoueur.get(0);
    }

    public void setJSuivant(int i) {
        this.jCour = listJoueur.get(i);

    }
}
