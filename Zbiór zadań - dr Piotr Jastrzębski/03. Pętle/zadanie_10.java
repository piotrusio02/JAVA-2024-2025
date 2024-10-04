/* Stwórz program, który przyjmie od użytkownika liczbę całkowitą
   i zwróci tę liczbę w odwrotnej kolejności. Na przykład, dla liczby
   12345, wynik powinien wynosić 54321. Możesz ograniczyć program tylko
   do liczb dodatnich. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int temp = scanner.nextInt();

        while(temp > 0){
            System.out.print(temp % 10);
            temp /= 10;
        }
    }
}
