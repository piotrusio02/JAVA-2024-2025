/* Napisz program, który sprawdza, czy podana liczba całkowita jest parzysta. 
   Jeżeli tak, program powinien wypisać “Liczba jest parzysta”, w przeciwnym 
   razie “Liczba jest nieparzysta”. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int a = scanner.nextInt();

        if(a % 2 == 0){
            System.out.println("Liczba jest parzysta");
        }
        else {
            System.out.println("liczba nie jest parzysta");
        }
    }
}
