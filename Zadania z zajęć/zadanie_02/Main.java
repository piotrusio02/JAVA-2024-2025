/* Napisz statyczną metodę minimumValue, która przyjmuje 
listę tablicową liczb całkowitych jako argument i zwraca 
najmniejszą liczbę w liście tablicowej. Przyjmij, że lista 
tablicowa zawsze będzie miała co najmniej jeden element. Stwórz 
przypadek testowy. */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> liczby = new ArrayList<Integer>();
        for (int i = 0; i < 15; i++) {
            liczby.add(i);
        }
        System.out.println(listyTablicoweTrening.minimumValue(liczby));
    }
}
