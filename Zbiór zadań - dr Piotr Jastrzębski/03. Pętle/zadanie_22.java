/* Napisz program, który pobiera od użytkownika trzy dodatnie 
   liczby całkowite a, b, c. Na standardowym wyjściu wyświetl dodatnie 
   liczby całkowite większe od b, mniejsze lub równe od a i podzielne przez c. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.print("Podaj liczbę a: ");
        a = scanner.nextInt();
        System.out.print("Podaj liczbę b: ");
        b = scanner.nextInt();
        System.out.print("Podaj liczbę c: ");
        c = scanner.nextInt();

        if (a < 0 || b < 0 || c < 0){
            System.out.println("liczby nie mogą być ujemne");
        }

        for(int i = b + 1; i <= a; i++){
            if(i % c == 0){
                System.out.println(i);
            }
        }
    }
}
