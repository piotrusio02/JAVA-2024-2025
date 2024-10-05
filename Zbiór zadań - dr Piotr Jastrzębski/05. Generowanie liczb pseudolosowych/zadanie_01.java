/* Napisz metodę generateRandomInt, która generuje 
   i zwraca losową liczbę całkowitą. Stwórz przypadek testowy. */


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(generateRandomInt());

    }
    static int generateRandomInt(){
        Random rand = new Random();
        int a = rand.nextInt(1,10);
        return a;
    }
}
