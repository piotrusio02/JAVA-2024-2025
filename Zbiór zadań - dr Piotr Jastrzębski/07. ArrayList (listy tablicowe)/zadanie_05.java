/* Napisz statyczną metodę average, która przyjmuje 
   listę tablicową liczb zmiennoprzecinkowych jako 
   argument i zwraca średnią arytmetyczną wszystkich 
   liczb. Jeżeli lista tablicowa jest pusta, zwróć 0. 
   Stwórz przypadek testowy. */


import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> arr = new ArrayList<Double>();
        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
            arr.add(rand.nextDouble(1,11));
        }
        System.out.println(average(arr));
    }
    static double average(ArrayList<Double> arr){
        double temp = 0;
        for (int i = 0; i < arr.size(); i++) {
            temp += arr.get(i);

        }
        return temp/arr.size();
    }
}

