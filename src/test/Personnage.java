package test;


import java.util.ArrayList;
import java.util.List;

public class Personnage {
    public int porte_monnaie;
    public String name;
    public Case c;
    Depart depart = new Depart();
    Achetable achetable = new Achetable();

    Personnage(){
    }
    Personnage(String name){
        this.name = name;
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

    private ArrayList<Achetable> listAchetable =new ArrayList<Achetable>();

    public List<Achetable> getListAchetable() {
        // Automatically generated method. Please do not modify this code.
        return this.listAchetable;
    }

    public void setListAchetable(final List<Achetable> value) {
        // Automatically generated method. Please do not modify this code.
        new ArrayList<Achetable>();
    }

    public void create(Case p1) {
        setCase(depart);
        new Personnage();
    }

    public boolean testSolde(int somme){
        if (porte_monnaie > somme){
            return true;
        }else { return false;}
    }

    public void ajoutCaseAchetable(Case c){
        listAchetable.add((Achetable) c);
    }

    public void debiterCompte(int somme){
        if (testSolde(somme)){
            porte_monnaie = porte_monnaie - somme;
        }
    }

    public int lancerDes(){
        int nombreAleatoire = 2 + (int)(Math.random() * ((12 - 2) + 1));
        return nombreAleatoire;
    }

    public void avancerJoueur(int pas){
        for (int i= 0; i< lancerDes(); i++){

        }
    }

    public void achatCase(Achetable a){
        if (a.estAchetable(a)){
            a.getPrix();
            debiterCompte(a.getPrix());
            ajoutCaseAchetable(a);
        }
    }
}
