/* Napisz statyczną metodę average, która przyjmuje listę tablicową 
liczb zmiennoprzecinkowych jako argument i zwraca średnią arytmetyczną 
wszystkich liczb. Jeżeli lista tablicowa jest pusta, zwróć 0. Stwórz przypadek testowy. */

/* Main.java */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> liczby = new ArrayList<Double>();
        for (int i = 0; i < 15; i++) {
            liczby.add((double) i);
        }
        System.out.println(listyTablicoweTrening.average(liczby));
    }
}
