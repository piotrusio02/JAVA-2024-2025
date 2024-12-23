/* Napisz statyczną metodę reverseArray, która przyjmuje listę tablicową 
   liczb całkowitych jako argument. Metoda odwraca porządek elementów w 
   liście tablicowej i powinna być procedurą. Na przykład, dla [1, 2, 3, 4, 5], 
   funkcja powinna zmienić listę tablicową na [5, 4, 3, 2, 1]. 
   Stwórz przypadek testowy. */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> tab = new ArrayList<Integer>();
        tab.add(1);
        tab.add(2);
        tab.add(3);
        tab.add(4);
        tab.add(5);
        System.out.println(tab);
        reverseArray(tab);
        System.out.println(tab);

    }

    public static void reverseArray(ArrayList<Integer> tab){
        int temp;
        for(int i = 0; i < tab.size() / 2;i++){
            temp = tab.get(i);
            tab.set(i, tab.get(tab.size()-i-1));
            tab.set(tab.size()-i-1, temp);
        }
    }
}
