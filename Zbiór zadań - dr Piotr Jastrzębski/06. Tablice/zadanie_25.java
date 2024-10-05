/* Napisz metodę checkEquality, która przyjmuje dwie tablice liczb 
   całkowitych jako argumenty i zwraca wartość true, jeśli tablice 
   są równe, a false w przeciwnym razie. Wykorzystaj metodę Arrays.equals() 
   z biblioteki java.util.Arrays do porównania tablic. Stwórz przypadek testowy. */


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 3};
        int[] tab2 = {1, 2, 3, 4, 5};
        System.out.println(checkEquality(tab, tab2));
    }
    static Boolean checkEquality(int[] tab, int[] tab2){
        boolean equals = Arrays.equals(tab, tab2);
        return equals;
    }
}
