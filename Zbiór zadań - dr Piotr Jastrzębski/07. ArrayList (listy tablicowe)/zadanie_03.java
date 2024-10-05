/* Napisz statyczną metodę minimumValue, która 
   przyjmuje listę tablicową liczb całkowitych 
   jako argument i zwraca najmniejszą liczbę w liście 
   tablicowej. Przyjmij, że lista tablicowa zawsze będzie 
   miała co najmniej jeden element. Stwórz przypadek testowy. */


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(4,2,5,1,-5,2));
        System.out.println(minimumValue(arr));

    }
    static int minimumValue(ArrayList<Integer> arr){
        int temp = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if(temp > arr.get(i)) {
                temp = arr.get(i);
            }
        }
        return temp;
    }
}
