/* Napisz metodę generateRandomBoolean, która 
   generuje i zwraca losową wartość logiczną 
   (true lub false). Stwórz przypadek testowy. */


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.print(generateRandomBoolean());


    }
    static Boolean generateRandomBoolean(){
        Random rand = new Random();
        Boolean a = rand.nextBoolean();
        return a;
    }

}

