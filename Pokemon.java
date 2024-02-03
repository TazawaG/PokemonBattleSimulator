class Pokemon {
    String nom;
    Type type1;
    Type type2;
    int[] stats = new int[6];
    Atk[] atks;

    Pokemon(String nom, Type type1, Type type2, int pv, int atk, int def, int atksp, int defsp, int vit, Atk[] atks) {
        this.nom = nom;
        this.type1 = type1;
        this.type2 = type2;
        stats[0] = pv;
        stats[1] = atk;
        stats[2] = def;
        stats[3] = atksp;
        stats[4] = defsp;
        stats[5] = vit;
        this.atks = atks;
    }

    public String toString() {
        return(this.nom + "\n" +
               "Type 1: " + this.type1 + "   Type 2: " + this.type2 + "\n" +
               "Stats:\n  PV:    " + this.stats[0] + "\n  ATK:   " + this.stats[1] + "\n  DEF:   " + this.stats[2] + "\n  ATKSP: " + this.stats[3] + "\n  DEFSP: " + this.stats[4] + "\n  VIT:   " + this.stats[5] + "\n" +
               "Attaques:\n  " + this.atks[0] + "\n  " + this.atks[1] + "\n  " + this.atks[2] + "\n  " + this.atks[3]);
    }

    static int damage(Pokemon player,Pokemon enemy,Atk atk){
        double crit=Math.random()*11;
        if (crit >= 10){
            crit=1.5;
        } else {
            crit=1;
        }
        double random = 1-((int) (Math.random()*16))*0.01;
        double STAB;
        if (atk.type == player.type1 || atk.type == player.type2){
            STAB=1.5;
        } else {
            STAB=1;
        }
        double typeeffect = Type.effectiveness(atk.type,enemy.type1,enemy.type2);
        int HP;
        if (!atk.s){
            HP=(int) ((((((2*75*crit)/5)+2)*atk.atk*((double) player.stats[1]/(double) enemy.stats[2])/50)+2)*STAB*typeeffect*random);
        }else{
            HP=(int) ((((((2*75*crit)/5)+2)*atk.atk*((double) player.stats[3]/(double) enemy.stats[4])/50)+2)*STAB*typeeffect*random);
        }
        if (typeeffect < 1 && typeeffect > 0) {
            System.out.println("Ce n'est pas très efficace...");
        } else if (typeeffect > 1) {
            System.out.println("Ç'est super efficace!");
        } else if (typeeffect == 0.0) {
            System.out.println("Ça n'affecte pas "+enemy.nom+" ...");
        }
        return HP;
    }
}