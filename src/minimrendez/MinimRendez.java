
package minimrendez;

public class MinimRendez {

    public static void main(String[] args) {
        int[] tomb = {
            334, 434, 2, 34, 312, 31,6 ,56 , 654, 33
        };
        int[] rendezett = minimumRendezes(tomb);
        for (int i = 0; i < rendezett.length - 1; i++) {
            System.out.print(rendezett[i] + ", ");
        }
        System.out.print(rendezett[rendezett.length-1]);
    }

    private static int[] minimumRendezes(int[] tomb) {
        for (int i = 0; i < tomb.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < tomb.length; j++) {
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
