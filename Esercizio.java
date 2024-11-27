//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[])
    {
        Scanner in = new Scanner( System.in );

        String[] v = new String[5];
        v[0] = "Matt";
        v[1] = "Chris";
        v[2] = "Dom";
        v[3] = "Adele";
        v[4] = "Celine";

        String[] w = String[5];
        for (i = 0; i <= 4; i++) {
            System.out.println("Inserisci il nome di un cantante: ");
            w[i] = in.next();
          }
          Integer[] x = Integer[10];
          for (i = 0; i <= 9; i++) {
            x[i] = i + 1;
          }

          Integer[] y = Integer[10];

          for (i = 0; i <= 9; i++) {
            y[i] = (i + 1) * 2;
          }
          System.out.println(v[0] + " " + v[2] + " " + v[4]);

          for(int i = 0; i < v.length; i++)
          {
            System.out.println(v[i]);
          }
          for(int i = 0; i < w.length; i++)
          {
            System.out.println(w[i]);
          }
          for(int i = 0; i < x.length; i++)
          {
            System.out.println(x[i]);
          }
          for(int i = 0; i < y.length; i++)
          {
            System.out.println(y[i]);
          }
          for (i = 0; i < x.length; i += 2) {
            System.out.println(x[i]);
          }
          for (i = 1; i < x.length; i += 2) {
            System.out.println(x[i]);
          }
          for (i = 0; i < x.lenght; i++) {
            if (x[i] % 2 == 0) {
              System.out.println(x[i]);
            }
        }
    }

}

//LEGGERE LE ISTRUZIONI NEL FILE README.md