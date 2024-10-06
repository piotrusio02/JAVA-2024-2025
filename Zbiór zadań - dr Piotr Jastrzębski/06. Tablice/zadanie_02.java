/* Utwórz program, który tworzy jednowymiarową tablicę 
   20 liczb losowych z przedziału od 1 do 100, a następnie 
   oblicza i wyświetla ich średnią wartość. */


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Double temp = 0.0;
        int[] tab = new int[20];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt(1,101);
            temp += tab[i];
        }

        System.out.println(temp/tab.length);
    }
}

