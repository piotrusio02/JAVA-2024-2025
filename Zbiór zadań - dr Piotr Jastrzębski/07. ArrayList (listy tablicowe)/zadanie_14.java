/* Napisz statyczną metodę mergeArrays, która przyjmuje dwie tablice
   liczb całkowitych jako argumenty. Funkcja powinna zwrócić nową
   listę tablicową, która jest połączeniem obu pierwotnych tablic.
   Na przykład, dla list tablicowych [1, 2, 3] i [4, 5, 6], funkcja
   powinna zwrócić [1, 2, 3, 4, 5, 6]. Stwórz przypadek testowy. */


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3));
        ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(4,5,6));
        ArrayList<Integer> temp = mergeArrays(arr, arr2);
        for (int i = 0; i < temp.size(); i++) {
            System.out.println(temp.get(i));

        }
    }
    static ArrayList<Integer> mergeArrays(ArrayList<Integer> arr, ArrayList<Integer> arr2){
        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        for (int i = 0; i < arr.size(); i++) {
            arr3.add(arr.get(i));
        }
        for(int i = arr.size()+1; i <= arr2.size() + arr.size(); i++){
            arr3.add(arr2.get(i - arr.size() - 1));
        }
        return arr3;
    }
}
