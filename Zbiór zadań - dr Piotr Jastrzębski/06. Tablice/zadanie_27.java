/* Napisz metodę printArray, która przyjmuje tablicę liczb 
   całkowitych jako argument i drukuje jej zawartość na konsoli. 
   Wykorzystaj do tego metodę Arrays.toString() z biblioteki 
   java.util.Arrays, która zwraca tekstową reprezentację tablicy. 
   Stwórz przypadek testowy. */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 6, 7};
        printArray(tab);
    }
    static void printArray(int[] tab){
        System.out.println(Arrays.toString(tab));
    }
}
