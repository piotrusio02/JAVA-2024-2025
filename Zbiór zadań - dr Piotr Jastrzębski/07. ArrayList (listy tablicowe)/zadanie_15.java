/* Napisz metodę sortArray, która przyjmuje listę tablicową liczb 
   całkowitych jako argument i zwraca nową listę tablicową, która 
   jest posortowaną wersją pierwotnej liście tablicowej. 
   Stwórz przypadek testowy. */


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(2,6,1,4,7));
        ArrayList<Integer> temp1 = sortArray(arr);
        for (int i = 0; i < temp1.size(); i++) {
            System.out.println(temp1.get(i));

        }
    }
    static ArrayList<Integer> sortArray(ArrayList<Integer> arr){
        ArrayList<Integer> arr2 = arr;
        int temp;
        for (int j = 0; j < arr2.size(); j++) {
            for (int i = 0; i < arr2.size()-1; i++) {
                if (arr2.get(i) > arr2.get(i + 1)) {
                    temp = arr2.get(i);
                    arr2.set(i, arr2.get(i + 1));
                    arr2.set(i + 1, temp);
                }
            }

        }
        return arr2;
    }
}
