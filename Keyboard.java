import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Keyboard {
   private static BufferedReader in;

   private static void prompter(String var0) {
      if (var0 != null) {
         System.out.print(var0);
         System.out.flush();
      }

   }

   private Keyboard() {
   }

   public static String readString(String var0) {
      prompter(var0);
      return readString();
   }

   public static String readString() {
      try {
         return in.readLine();
      } catch (IOException var1) {
         return "";
      }
   }

   public static int readInt(String var0) {
      return (int)readLong(var0);
   }

   public static int readInt() {
      return (int)readLong();
   }

   public static int readInt(int var0, int var1) {
      return (int)readLong((long)var0, (long)var1);
   }

   public static int readInt(String var0, int var1, int var2) {
      return (int)readLong(var0, (long)var1, (long)var2);
   }

   public static long readLong() {
      return readLong((String)null);
   }

   public static long readLong(String var0) {
      try {
         return Long.parseLong(readString(var0));
      } catch (NumberFormatException var2) {
         System.out.println("Erreur. Donnez un entier : ");
         return readLong();
      }
   }

   public static long readLong(long var0, long var2) {
      return readLong((String)null, var0, var2);
   }

   public static long readLong(String var0, long var1, long var3) {
      long var5 = readLong(var0);
      if (var1 <= var5 && var5 <= var3) {
         return var5;
      } else {
         System.out.println("Erreur. Donnez une valeur entre " + var1 + " et " + var3 + " :");
         return readLong(var1, var3);
      }
   }

   public static double readDouble() {
      return readDouble((String)null);
   }

   public static double readDouble(String var0) {
      try {
         return Double.parseDouble(readString(var0));
      } catch (NumberFormatException var2) {
         System.out.println("Erreur. Donnez un double : ");
         return readDouble();
      }
   }

   public static double readDouble(double var0, double var2) {
      return readDouble((String)null, var0, var2);
   }

   public static double readDouble(String var0, double var1, double var3) {
      double var5 = readDouble(var0);
      if (var1 <= var5 && var5 <= var3) {
         return var5;
      } else {
         System.out.println("Erreur. Donnez une valeur entre " + var1 + " et " + var3 + " :");
         return readDouble(var1, var3);
      }
   }

   public static char readChar() {
      return readChar((String)null);
   }

   public static char readChar(String var0) {
      return readString(var0).charAt(0);
   }

   public static char readChar(char var0, char var1) {
      return readChar((String)null, var0, var1);
   }

   public static char readChar(String var0, char var1, char var2) {
      char var3 = readChar(var0);
      if (var1 <= var3 && var3 <= var2) {
         return var3;
      } else {
         System.out.println("Erreur. Donnez une valeur entre " + var1 + " et " + var2 + " :");
         return readChar(var1, var2);
      }
   }

   static {
      in = new BufferedReader(new InputStreamReader(System.in));
   }
}
