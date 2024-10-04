/* Stwórz program do obliczenia pola kwadratu. 
   Dane pobierz od użytkownika, wynik wyświetl na 
   standardowym wyjściu. */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Podaj długość boku kwadratu: ");

        try {
            Scanner scanner = new Scanner(System.in);
            double a = scanner.nextDouble();
            System.out.println("Pole kwadratu to: " + (a*a));;

        } catch (InputMismatchException e) {
            System.out.println("Program przyjmuje tylko liczby!");
        }
    }
}
