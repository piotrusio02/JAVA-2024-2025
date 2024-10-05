/* Napisz metodę generateRandomDouble, która generuje i zwraca
   losową liczbę zmiennoprzecinkową z zakresu od 0.0 do 1.0.
   Stwórz przypadek testowy. */


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(generateRandomDouble());

    }
    static Double generateRandomDouble(){
        Random rand = new Random();
        Double a = rand.nextDouble(0.0,1.0);
        return a;
    }
}
