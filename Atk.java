class Atk {
    String nom;
    Type type;
    int atk;
    int prec;
    int pp;
    boolean s;
    boolean mult = true;
    String multMess;

    Atk(String nom, Type type, int atk, int prec, int pp, boolean s, String multMess){
        this.nom = nom;
        this.type = type;
        this.atk = atk;
        this.prec = prec;
        this.pp = pp;
        this.s = s;
        if (multMess.equals(" ")){
            this.mult = false;
        }
        this.multMess = multMess;
    }

    public String toString() {
        return(this.nom + "\t(" + this.type + ")\tPuiss: " + this.atk + "\tPrec: " + this.prec + "\tPP: " + this.pp);
    }
}