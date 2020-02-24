import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Personnage {
    public int porte_monnaie;
    private static Scanner sc = new Scanner(System.in);
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
    public int lancerDes() {
        int nombreAleatoire = 2 + (int) (Math.random() * ((12 - 2) + 1));

        return nombreAleatoire;
    }

    public void avancerJoueur(int pas) {
        for (int i = 0; i < lancerDes(); i++) {
            System.out.println(this.c.name);

            this.c = this.c.getCaseSuivante();
        }

        this.atterri(c);
    }

    private void atterri(Case c) {
        System.out.println(" Vous avez attérri sur la case "  + c.name);
    }

    public boolean testSolde(int somme) {
        return porte_monnaie > somme;
    }

    public void ajoutCaseAchetable(Case c) {
        listAchetable.add((Achetable) c);
    }

    public void debiterCompte(int somme) {
            porte_monnaie = porte_monnaie - somme;

    }



    public void achatCase() {
        c.acheter(this);

    }
    public void payerLoyer() {
        c.payerLoyer(this);
    }

    public void construire() {
        System.out.println("Sur quelle terrain voulez vous construire");
        String res = "";
        int i = 0;
        for (Achetable elm : listAchetable) {
            res+= " "+ i++ + " : " + elm.name;

        }
        System.out.println(res);
        System.out.println("taper le numero du terrain");

        String str = sc.nextLine();
        Case c = listAchetable.get(Integer.parseInt(str));
        c.construction(this);

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

    public void create(Case p1) {
    }

    public void setCaseCourante(Case c) {
    }


    public void finTour() {
    }


    public void debiterCompte() {
    }


    public boolean apartient(Achetable a) {
        return listAchetable.contains(a);
    }
}
