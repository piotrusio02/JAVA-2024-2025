/* Napisz metodę sortArray, która przyjmuje tablicę liczb 
   całkowitych jako argument i zwraca nową tablicę, która 
   jest posortowaną wersją pierwotnej tablicy. Wykorzystaj 
   metodę Arrays.sort() z biblioteki java.util.Arrays do 
   posortowania tablicy. Stwórz przypadek testowy. */



import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] tab = {4,1,5,3,6,2};
        int[] tab2 = sortArray(tab);
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab2[i]+ ", ");

        }
    }
    static int[] sortArray(int[] tab){
        int[] temp = tab;
        Arrays.sort(temp);
        return temp;
    }
}
