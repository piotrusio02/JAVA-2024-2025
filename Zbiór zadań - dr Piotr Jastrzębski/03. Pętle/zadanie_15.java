/* Napisz program pobierający z klawiatury liczbę 
   całkowitą dodatnią. Następnie narysuj odpowiedni trójkąt */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int n = scanner.nextInt();

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print(j);
            }
            System.out.print("\n");

        }
    }
}
