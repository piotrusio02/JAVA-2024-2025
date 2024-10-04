/* Napisz program, który będzie sprawdzał, czy podany rok jest rokiem 
   przestępnym. Rok jest przestępny, jeśli jest podzielny przez 4, 
   ale nie jest podzielny przez 100, chyba że jest podzielny przez 400. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj rok: ");
        int rok = scanner.nextInt();

        if(rok % 4 != 0){
            System.out.println("Rok nie jest przestępny");
        }
        else{
            if((rok % 100 == 0) && (rok % 400 != 0)){
                System.out.println("Rok nie jest przestępny");
            }
            else {
                System.out.println("Rok jest przestępny");
            }
        }
    }
}
