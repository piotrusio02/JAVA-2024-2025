/* Napisz statyczną metodę mergeArrays, która przyjmuje dwie tablice liczb 
  całkowitych jako argumenty. Funkcja powinna zwrócić nową listę tablicową, 
  która jest połączeniem obu pierwotnych tablic. Na przykład, dla list 
  tablicowych [1, 2, 3] i [4, 5, 6], funkcja powinna zwrócić [1, 2, 3, 4, 5, 6]. 
  Stwórz przypadek testowy. */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> tab = new ArrayList<Integer>();
        tab.add(1);
        tab.add(2);
        tab.add(3);
        ArrayList<Integer> tab2 = new ArrayList<Integer>();
        tab2.add(4);
        tab2.add(5);
        tab2.add(6);
        ArrayList<Integer> tab3 = mergeArrays(tab,tab2);
        System.out.println(tab3);
    }

    public static ArrayList<Integer> mergeArrays(ArrayList<Integer> tab, ArrayList<Integer> tab2){
        ArrayList<Integer> tab3 = new ArrayList<Integer>();
        for (int i = 0; i < tab.size(); i++) {
            tab3.add(tab.get(i));
        }
        for (int i = 0; i < tab2.size(); i++) {
            tab3.add(tab2.get(i));
        }

        return tab3;
    }
}
