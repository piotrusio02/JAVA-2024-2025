/* Napisz metodę generateRandomIntInRange, która przyjmuje dwie liczby całkowite 
   jako argumenty i zwraca losową liczbę całkowitą z tego zakresu (włącznie z granicami). 
   Na przykład, dla argumentów 5 i 10, metoda powinna zwracać liczbę z zakresu od 5 do 10. */


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(generateRandomIntInRange(2,11)); //zakres od 2 do 10

    }
    static int generateRandomIntInRange(int a, int b){
        Random rand = new Random();
        int temp = rand.nextInt(a,b);
        return temp;
    }

}
