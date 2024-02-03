enum Type {
    NORMAL,
    FEU,
    EAU,
    ELECTRIK,
    PLANTE,
    GLACE,
    COMBAT,
    POISON,
    SOL,
    VOL,
    PSY,
    INSECTE,
    ROCHE,
    SPECTRE,
    DRAGON,
    TENEBRES,
    ACIER,
    FEE,
    NONE;

    static double[][] typeTable = new double[][]{{1  ,1  ,1  ,1  ,1  ,1  ,1  ,1  ,1  ,1  ,1  ,1  ,0.5,0  ,1  ,1  ,0.5,1  },
                                                 {1  ,0.5,0.5,1  ,2  ,2  ,1  ,1  ,1  ,1  ,1  ,2  ,0.5,1  ,0.5,1  ,2  ,1  },
                                                 {1  ,2  ,0.5,1  ,0.5,1  ,1  ,1  ,2  ,1  ,1  ,1  ,2  ,1  ,0.5,1  ,1  ,1  },
                                                 {1  ,1  ,2  ,0.5,0.5,1  ,1  ,1  ,0  ,2  ,1  ,1  ,1  ,1  ,0.5,1  ,1  ,1  },
                                                 {1  ,0.5,2  ,1  ,0.5,1  ,1  ,0.5,2  ,0.5,1  ,0.5,2  ,1  ,0.5,1  ,1  ,1  },
                                                 {1  ,0.5,0.5,1  ,2  ,0.5,1  ,1  ,2  ,2  ,1  ,1  ,1  ,1  ,2  ,1  ,0.5,1  },
                                                 {2  ,1  ,1  ,1  ,1  ,2  ,1  ,0.5,1  ,0.5,0.5,0.5,2  ,0  ,1  ,2  ,2  ,0.5},
                                                 {1  ,1  ,1  ,1  ,2  ,1  ,1  ,0.5,0.5,1  ,1  ,1  ,0.5,0.5,1  ,1  ,0  ,2  },
                                                 {1  ,2  ,1  ,2  ,0.5,1  ,1  ,2  ,1  ,0  ,1  ,0.5,2  ,1  ,1  ,1  ,2  ,1  },
                                                 {1  ,1  ,1  ,0.5,2  ,1  ,2  ,1  ,1  ,1  ,1  ,2  ,0.5,1  ,1  ,1  ,0.5,1  },
                                                 {1  ,1  ,1  ,1  ,1  ,1  ,2  ,2  ,1  ,1  ,0.5,1  ,1  ,1  ,1  ,0  ,0.5,1  },
                                                 {1  ,0.5,1  ,1  ,2  ,1  ,0.5,0.5,1  ,0.5,2  ,1  ,1  ,0.5,1  ,2  ,0.5,0.5},
                                                 {1  ,2  ,1  ,1  ,1  ,2  ,0.5,1  ,0.5,2  ,1  ,2  ,1  ,1  ,1  ,1  ,0.5,1  },
                                                 {0  ,1  ,1  ,1  ,1  ,1  ,1  ,1  ,1  ,1  ,2  ,1  ,1  ,2  ,1  ,0.5,1  ,1  },
                                                 {1  ,1  ,1  ,1  ,1  ,1  ,1  ,1  ,1  ,1  ,1  ,1  ,2  ,1  ,2  ,1  ,0.5,0  },
                                                 {1  ,1  ,1  ,1  ,1  ,1  ,0.5,1  ,1  ,1  ,2  ,1  ,1  ,2  ,1  ,0.5,1  ,0.5},
                                                 {1  ,0.5,0.5,0.5,1  ,2  ,1  ,1  ,1  ,1  ,1  ,1  ,2  ,1  ,1  ,1  ,0.5,1  },
                                                 {1  ,0.5,1  ,1  ,1  ,1  ,2  ,0.5,1  ,1  ,1  ,1  ,1  ,1  ,2  ,2  ,0.5,1  }};

    static Type initType(String type) {
        switch(type) {
            case "NORMAL":
                return Type.NORMAL;
            case "FEU":
                return Type.FEU;
            case "EAU":
                return Type.EAU;
            case "ELECTRIK":
                return Type.ELECTRIK;
            case "PLANTE":
                return Type.PLANTE;
            case "GLACE":
                return Type.GLACE;
            case "COMBAT":
                return Type.COMBAT;
            case "POISON":
                return Type.POISON;
            case "SOL":
                return Type.SOL;
            case "VOL":
                return Type.VOL;
            case "PSY":
                return Type.PSY;
            case "INSECTE":
                return Type.INSECTE;
            case "ROCHE":
                return Type.ROCHE;
            case "SPECTRE":
                return Type.SPECTRE;
            case "DRAGON":
                return Type.DRAGON;
            case "TENEBRES":
                return Type.TENEBRES;
            case "ACIER":
                return Type.ACIER;
            case "FEE":
                return Type.FEE;
            case "NONE":
                return Type.NONE;
        }
        return Type.NONE;
    }

    int toInt () {
        switch(this){
            case NORMAL:
                return 0;
            case FEU:
                return 1;
            case EAU:
                return 2;
            case ELECTRIK:
                return 3;
            case PLANTE:
                return 4;
            case GLACE:
                return 5;
            case COMBAT:
                return 6;
            case POISON:
                return 7;
            case SOL:
                return 8;
            case VOL:
                return 9;
            case PSY:
                return 10;
            case INSECTE:
                return 11;
            case ROCHE:
                return 12;
            case SPECTRE:
                return 13;
            case DRAGON:
                return 14;
            case TENEBRES:
                return 15;
            case ACIER:
                return 16;
            case FEE:
                return 17;
            case NONE:
                return 0;
        }
        return 0;
    }

    static double effectiveness(Type attacking,Type defending1,Type defending2) {
        double effect=1*typeTable[attacking.toInt()][defending1.toInt()];
        if (defending2!=Type.NONE){
            effect=effect*typeTable[attacking.toInt()][defending2.toInt()];
        }
        return effect;
    }
}