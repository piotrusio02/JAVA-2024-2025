/* Napisz statyczną metodę countZeros, która przyjmuje listę 
   tablicową liczb całkowitych jako argument i zwraca liczbę 
   wystąpień zera w liście tablicowej. Na przykład, dla 
   [0, 1, 2, 0, 3, 0, 4], funkcja powinna zwrócić 3. 
   Stwórz przypadek testowy. */


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(0,1,2,0,3,0,4));
        System.out.println(countZeros(arr));


    }
    static int countZeros(ArrayList<Integer> arr){
        int temp = 0;
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == 0){
                temp += 1;
            }
        }
        return temp;
    }
}
