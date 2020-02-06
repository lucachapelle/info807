package test;


import java.util.ArrayList;

public class Monopoly {
    int nbJoueurs;
    public int jCour;
    ArrayList<Personnage> listJoueur = new ArrayList<>();

    public void lancerPartie() {
        new Monopoly();
    }

    public void choisirOrdre() {
        for (int i = 0 ; i < listJoueur.size(); i++){

        }
    }

    public void ajouterPersonnage(Personnage personnage){
        listJoueur.add(personnage);
    }

    public void afficheListeJoueur(){
        for(Personnage elem: listJoueur)
        {
            System.out.println (elem.name);
        }
    }

    public void setJCourant() {
        this.jCour = jCour;
    }

}
