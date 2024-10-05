/* Napisz program, który tworzy jednowymiarową tablicę 15
   liczb całkowitych, a następnie oblicza i wyświetla sumę
   liczb, które są podzielne przez 3. */


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] tab = new int[15];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt(1,11);

        }
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + ", ");

        }
        int temp = 0;
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] % 3 == 0){
                temp += tab[i];
            }

        }
        System.out.println("\n"+temp);
    }
}
