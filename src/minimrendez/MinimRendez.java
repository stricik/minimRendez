    package minimrendez;

import java.util.Random;

public class MinimRendez {

    static Random rnd = new Random();
    
    public static void main(String[] args) {
        int[] tomb = new int [10];
        tomb = randomFeltoltes(tomb, 10);
        System.out.println("rendezetlen:");
        tombKiir(tomb);
        int[] rendezett = minimumRendezes(tomb);
        System.out.println("rendezett:");
        tombKiir(rendezett);
    }

    private static int[] randomFeltoltes(int[] tomb, int szam) {
        for (int i = 0; i < szam; i++) {
            tomb[i] = rnd.nextInt(100);
        }
        return tomb;
    }

    private static void tombKiir(int[] rendezett) {
        for (int i = 0; i < rendezett.length - 1; i++) {
            System.out.print(rendezett[i] + ", ");
        }
        System.out.println(rendezett[rendezett.length - 1]);
    }

    private static int[] minimumRendezes(int[] tomb) {
        for (int i = 0; i < tomb.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < tomb.length; j++) {
                if (tomb[min] > tomb[j]) {
                    min = j;
                }
            }
            int w;
            w = tomb[i];
            tomb[i] = tomb[min];
            tomb[min] = w;
        }
        return tomb;
    }

}
