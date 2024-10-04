/* Napisz program, który pobiera od użytkownika 5 liczb całkowitych.
   Pobieranie ma zostać przerwane, gdy użytkownik wprowadzić liczbę 
   ujemną. Jeśli pobieranie nie zostanie przerwane, wyświetl sumę 
   wprowadzonych liczb. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp, wynik = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Podaj liczbę: ");
            temp = scanner.nextInt();
            if(temp < 0){
                System.out.println("operacja przerwana :c");
                return;
            }
            else {
                wynik = wynik + temp;
            }
        }
        System.out.println("Suma: " + wynik);
    }
}

