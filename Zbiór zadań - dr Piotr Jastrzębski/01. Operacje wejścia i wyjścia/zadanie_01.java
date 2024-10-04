/* Napisz prostą aplikację kalkulatora tekstowego, która przyjmuje dwa liczby od użytkownika
   jako wejście i wykonuje podstawowe operacje matematyczne (dodawanie, odejmowanie, mnożenie,
   dzielenie). Wyświetl wyniki na ekranie. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b;
        double wynik = 0;
        char options;
        String choice;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Podaj pierwszą liczbę: ");
            a = Double.parseDouble(scanner.next());

            System.out.print("Podaj drugą liczbę: ");
            b = Double.parseDouble(scanner.next());

            System.out.print("Wpisz wybraną opcje |  +  |  -  |  *  |  /  |: ");
            options = scanner.next().charAt(0);

            switch (options) {
                case '+':
                    wynik = a + b;
                    System.out.printf("%.2f %s %.2f = %.2f \n", a, options, b, wynik);
                    break;
                case '-':
                    wynik = a - b;
                    System.out.printf("%.2f %s %.2f = %.2f \n", a, options, b, wynik);
                    break;
                case '*':
                    wynik = a * b;
                    System.out.printf("%.2f %s %.2f = %.2f \n", a, options, b, wynik);
                    break;
                case '/':
                    if (b != 0) {
                        wynik = a / b;
                        System.out.printf("%.2f %s %.2f = %.2f \n", a, options, b, wynik);
                    } else{
                        System.out.print("Nie można dzielić przez 0\n");
                        break;
                    }
                    break;
                default:
                    System.out.print("Nie rozpoznano znaku\n");
                    break;
            }
            System.out.print("Jeszcze raz? T/N: ");
            choice = scanner.next();
            choice = choice.toUpperCase();


            switch (choice){
                case "T":
                    continue;
                default:
                    return;

            }
        }
    }
}
