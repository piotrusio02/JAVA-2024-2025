/* Napisz program, który na podstawie podanego jako argument numeru 
   dnia tygodnia (od 1 do 7) wypisze nazwę tego dnia tygodnia. Dla 
   przykładu, jeżeli użytkownik poda liczbę 1, program powinien wypisać 
   “Poniedziałek”. Jeżeli podana liczba nie jest z zakresu od 1 do 7, program 
   powinien wyświetlić komunikat “Niepoprawny numer dnia tygodnia”. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj numer z zakredu od 1 do 7: ");
        int dzien = scanner.nextInt();

        if (dzien == 1){
            System.out.println("Poniedziałek");
        }
        else if (dzien == 2){
            System.out.println("Wtorek");
        }
        else if (dzien == 3){
            System.out.println("Środa");
        }
        else if (dzien == 4){
            System.out.println("Czwartek");
        }
        else if (dzien == 5){
            System.out.println("Piątek");
        }else if (dzien == 6){
            System.out.println("Sobota");
        }
        else if (dzien == 7){
            System.out.println("Niedziela");
        }
        else {
            System.out.println("Niepoprawny numer dnia tygodnia");
        }
    }
}
