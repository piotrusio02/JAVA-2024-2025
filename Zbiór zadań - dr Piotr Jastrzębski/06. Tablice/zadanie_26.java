/* Napisz metodę fillArray, która przyjmuje tablicę liczb całkowitych 
   i liczbę całkowitą jako argumenty. Metoda powinna wypełnić tablicę 
   podaną liczbą, wykorzystując do tego metodę Arrays.fill() z biblioteki 
   java.util.Arrays. Stwórz przypadek testowy. */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] tab = new int[10];
        int n = 3;
        fillArray(tab,n);
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + ", ");
            
        }
    }
    static void fillArray(int[] tab, int n){
        Arrays.fill(tab, n);
    }
}
