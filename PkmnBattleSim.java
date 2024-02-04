class PkmnBattleSim {
    static final int HP = 0;
    static final int ATK = 1;
    static final int DEF = 2;
    static final int ATKSP = 3;
    static final int DEFSP = 4;
    static final int VIT = 5;

    static Atk[] atkDatabase = loadAtks();
    static Pokemon[] pkmnDatabase = loadPkmns();

    static Pokemon you;
    static Pokemon enemy;

    static Atk[] loadAtks() {
        CSVFile atkCSV = new CSVFile("./data/atks.csv");
        Atk[] atkDatabase = new Atk[atkCSV.rowCount() - 1];
        for (int i = 0; i < atkDatabase.length; i += 1) {
            atkDatabase[i] = new Atk(atkCSV.getCell(i+1,0),Type.initType(atkCSV.getCell(i+1,1)),Integer.parseInt(atkCSV.getCell(i+1,2)),Integer.parseInt(atkCSV.getCell(i+1,3)),Integer.parseInt(atkCSV.getCell(i+1,4)),Funcs.stringToBoolean(atkCSV.getCell(i+1,5)),atkCSV.getCell(i+1,6));
        }
        return atkDatabase;
    }
    static Pokemon[] loadPkmns() {
        CSVFile pkmnCSV = new CSVFile("./data/dex.csv");
        pkmnDatabase = new Pokemon[pkmnCSV.rowCount() - 1];
        for (int i = 0; i < pkmnDatabase.length; i += 1) {
            pkmnDatabase[i] = new Pokemon(pkmnCSV.getCell(i+1,0), Type.initType(pkmnCSV.getCell(i+1,1)), Type.initType(pkmnCSV.getCell(i+1,2)), Integer.parseInt(pkmnCSV.getCell(i+1,3)), Integer.parseInt(pkmnCSV.getCell(i+1,4)), Integer.parseInt(pkmnCSV.getCell(i+1,5)), Integer.parseInt(pkmnCSV.getCell(i+1,6)), Integer.parseInt(pkmnCSV.getCell(i+1,7)), Integer.parseInt(pkmnCSV.getCell(i+1,8)), new Atk[]{stringToAtk(pkmnCSV.getCell(i+1,9)), stringToAtk(pkmnCSV.getCell(i+1,10)), stringToAtk(pkmnCSV.getCell(i+1,11)), stringToAtk(pkmnCSV.getCell(i+1,12))});
        }
        return pkmnDatabase;
    }

    static Atk stringToAtk(String atk) {
        Atk atkRes = atkDatabase[0];
        for (int i = 0; i < atkDatabase.length; i += 1) {
            if (atk.equals(atkDatabase[i].nom)) {
                atkRes = atkDatabase[i];
            }
        }
        return atkRes;
    }
    static boolean isValidPokemon(String attempt) {
        for (int i = 0; i < pkmnDatabase.length; i += 1) {
            if(pkmnDatabase[i].nom.equals(attempt)) {return true;}
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.print("Bienvenue dans le Pokémon Battle Simulator!\n\nVeuillez choisir un Pokémon dans la liste suivante:\n\t");
        for (int i = 0; i < pkmnDatabase.length - 1; i += 1) {
            System.out.print(pkmnDatabase[i].nom + ", ");
        }
        System.out.println("et " + pkmnDatabase[pkmnDatabase.length-1].nom + "\n");
        /*String pkmnAttempt = ;
        while (!isValidPokemon(pkmnAttempt)) {
            for (int i = 0; i < pkmnDatabase.length - 1; i += 1) {
                System.out.print(pkmnDatabase[i].nom + ", ");
            }
            System.out.println("et " + pkmnDatabase[pkmnDatabase.length-1].nom + "\n");
            pkmnAttempt = ;
        }*/
    }
}