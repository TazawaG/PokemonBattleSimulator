class Funcs {
    public static boolean stringToBoolean(String str) {
        if (str.equals("true")) {
            return true;
        }
        return false;
    }
    public static void delay(int var1) {
        try {
            Thread.sleep((long)var1);
        } catch (InterruptedException var3) {
            var3.printStackTrace();
            System.err.println("[iJava] InterruptedException in delay");
        }
  
    }
    static void clearScreen() {
        for (int i = 0; i < 100; i += 1) {
            System.out.println();
        }
    }
}