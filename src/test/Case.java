package test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Case {
    Depart depart;
    Case boulevard_belleville;
    String name;
    Case casePrecedente;
    Case caseActuelle;
    Case caseSuivante;

    public Case(String nom, Case c) {
        this.name = nom;
        this.caseSuivante = c;
    }

    public Case(String str) {
        this.name = str;
        this.caseSuivante = this;


    }

    public Case(String nom, Case c, int prix) {
    }

    public Case getCaseActuelle() {
        return this.caseActuelle;
    }

    public void setCaseActuelle(Case name) {
        caseActuelle = name;
    }

    public Case getCaseSuivante() {
        return this.caseSuivante;
    }

    public void setCaseSuivante(Case name) {
        caseSuivante = name;
    }


}