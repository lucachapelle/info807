public abstract class Case {
    Depart depart;
    Case boulevard_belleville;
    String name;
    Case casePrecedente;
    Case caseActuelle;
    Case caseSuivante;
    Quartier quartier;


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

    public abstract void acheter(Personnage personnage);

    public abstract void setEtat(Etat e);

    public abstract void payerLoyer(Personnage personnage);

    public abstract int getPrixLoyer();

    public abstract void construction(Personnage personnage);
}
