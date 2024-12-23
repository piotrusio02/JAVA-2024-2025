/* Napisz statyczną metodę average, która przyjmuje listę 
tablicową liczb zmiennoprzecinkowych jako argument i zwraca 
średnią arytmetyczną wszystkich liczb. Jeżeli lista tablicowa 
jest pusta, zwróć 0. Stwórz przypadek testowy. */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> tab = new ArrayList<Double>();
        tab.add(4.5);
        tab.add(2.5);
        tab.add(3.0);
        tab.add(4.75);
        tab.add(5.25);
        System.out.println(average(tab));
    }

    public static double average(ArrayList<Double> tab){
        double temp = 0;
        for(double e : tab){
            temp += e;
        }
        return temp / tab.size();
    }
}
