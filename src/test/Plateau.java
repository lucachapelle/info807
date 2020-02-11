package test;


import java.util.ArrayList;

public class Plateau {
    public Depart getCaseDepart() {
        // TODO Auto-generated return
        return null;
    }

    public static ArrayList<Case> creeCase() {
        ArrayList<Case> listCase = new ArrayList<>();
        Depart depart = new Depart("Depart");
        Case courbcelles = new Terrain("Rue de Courbecelles",depart);
        Case vaugibard = new Terrain("Rue de Vaugirad", courbcelles);
        Gare montparnasse = new Gare("Gare de Montparnasse", vaugibard);
        Case lecourbe = new Terrain("Rue Lecourbe", montparnasse);
        Case boulevard = new Terrain("Boulevard de Belleville", lecourbe);
        depart.setCaseSuivante(boulevard);


        listCase.add(depart);
        listCase.add(boulevard);
        listCase.add(lecourbe);
        listCase.add(montparnasse);
        listCase.add(vaugibard);
        listCase.add(courbcelles);

        return listCase;
    }
}
