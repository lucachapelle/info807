package test;


import java.util.ArrayList;
import java.util.List;

public class Personnage {

    public int porte_monnaie;
    public String name;
    public Case c;
    public ArrayList<Achetable> listAchetable = new ArrayList<Achetable>();

    Personnage(String name) {
        this.name = name;
        this.porte_monnaie = 2000;

    }

    Personnage(String name, Case c) {
        this.name = name;
        this.c = c;
        this.porte_monnaie = 2000;


    }

    public Case getCase() {
        // Automatically generated method. Please do not modify this code.
        return this.c;
    }

    public void setCase(final Case value) {
        // Automatically generated method. Please do not modify this code.
        this.c = value;
    }


    public List<Achetable> getListAchetable() {
        // Automatically generated method. Please do not modify this code.
        return this.listAchetable;
    }

    public void setListAchetable(final List<Achetable> value) {
        // Automatically generated method. Please do not modify this code.
        new ArrayList<Achetable>();
    }

  /*  public void create(Case p1) {
        setCase(depart);
        new Personnage();
    }*/

    public boolean testSolde(int somme) {
        if (porte_monnaie > somme) {
            return true;
        } else {
            return false;
        }
    }

    public void ajoutCaseAchetable(Case c) {
        listAchetable.add((Achetable) c);
    }

    public void debiterCompte(int somme) {
        if (testSolde(somme)) {
            porte_monnaie = porte_monnaie - somme;
        }
    }

    public int lancerDes() {
        int nombreAleatoire = 2 + (int) (Math.random() * ((12 - 2) + 1));

        return nombreAleatoire;
    }

    public void avancerJoueur(int pas) {
        for (int i = 0; i < lancerDes(); i++) {
            System.out.println(this.c.name);

            this.c = this.c.getCaseSuivante();
        }
        this.atterri();
    }

    private void atterri() {
    }

    public void achatCase() {


        Achetable caseA = (Achetable) c;
        if (caseA.estAchetable()) {
            caseA.estAchetable = false;
            int p = caseA.getPrix();
            testSolde(p);
            debiterCompte(p);
            ajoutCaseAchetable(caseA);
            System.out.println("La case est en votre possession!");
        }
//    }
        else {
            System.out.println("La case appartient deja a quelqu'un");
        }
    }

    public boolean construire() {
        if (c.getClass().equals(Terrain.class)) {
            Terrain caseT = (Terrain) c;
            return caseT.construction();

        } else {
            return false;
        }
    }

    public void afficheListeCase() {
        if (listAchetable.isEmpty()) {
            System.out.println("Vous ne possedez pas de carte encore!");
        } else {
            System.out.println("Vous possedez les cartes suivantes: ");

            for (Case elem : listAchetable) {
                System.out.println("nom " + elem.name);
            }
        }
    }
}

