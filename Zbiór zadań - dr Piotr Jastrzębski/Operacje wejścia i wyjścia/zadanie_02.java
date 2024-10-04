/* Napisz program, który wczytuje ze standardowego wejścia dwa łańcuchy znaków, 
   a następnie wypisuje je w kolejnych wierszach na standardowym wyjściu. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        String temp2 = scanner.nextLine();

        System.out.println("Twój tekst:");
        System.out.println(temp);
        System.out.println(temp2);
    }
}
