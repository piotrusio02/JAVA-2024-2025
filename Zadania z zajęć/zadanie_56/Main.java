/* Napisz program, który prosi użytkownika o wpisanie dwóch liczb, a 
następnie dzieli pierwszą liczbę przez drugą. Program powinien obsługiwać 
dwa rodzaje wyjątków: ArithmeticException w przypadku dzielenia przez zero 
i InputMismatchException, gdy użytkownik wprowadzi coś innego niż liczby. 
W obu przypadkach należy wyświetlić stosowny komunikat błędu i poprosić 
użytkownika o ponowne wprowadzenie danych. Wykorzystaj typ int.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("nie dziel przez zero");
        }catch(InputMismatchException e){
            System.out.println("wprowadzaj tylko liczby");
        }
    }
}
