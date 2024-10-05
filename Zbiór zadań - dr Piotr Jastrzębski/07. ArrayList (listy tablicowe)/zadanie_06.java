/* Napisz statyczną metodę reverseArray, która przyjmuje 
   listę tablicową liczb całkowitych jako argument i zwraca 
   nową listę tablicową, ale z odwróconym porządkiem elementów. 
   Na przykład, dla [1, 2, 3, 4, 5], funkcja powinna zwrócić 
   [5, 4, 3, 2, 1]. Stwórz przypadek testowy. */


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(5);

        ArrayList<Integer> temp = reverseArray(arr);
        System.out.print(temp);
    }
    static ArrayList<Integer> reverseArray(ArrayList<Integer> arr){
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        for (int i = arr.size() - 1; i >= 0 ; i--) {
            arr2.add(arr.get(i));
        }
        return arr2;
    }
}

