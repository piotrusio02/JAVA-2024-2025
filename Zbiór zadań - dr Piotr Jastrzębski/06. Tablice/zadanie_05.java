/* Napisz program, który tworzy jednowymiarową tablicę 10 liczb 
   całkowitych. Program powinien obliczać i wyświetlać sumę tych 
   liczb, które są parzyste. */


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] tab = new int[10];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt(1,10);

        }

        int temp = 0;
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] % 2 == 0){
                temp += tab[i];
            }
        }
        System.out.println(temp);
    }
}
