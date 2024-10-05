/* Napisz statyczną metodę, której argumentem jest dodatnia liczba całkowita n. 
   Metoda zwraca odpowiednią wartość logiczną sprawdzającą czy n jest liczbą doskonałą. */


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int n = scanner.nextInt();
        System.out.println(Dzielniki(n));
        System.out.println(Doskonala(n));

    }
    static ArrayList<Integer> Dzielniki(int n){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for (int i = 1; i < n; i++) {
            if (n % i == 0){
                lista.add(i);
            }
        }
        return lista;
    }
    static Boolean Doskonala(int n){
        int temp = 0;
        ArrayList<Integer> lista = Dzielniki(n);
        for (int i = 0; i < lista.size(); i++) {
            temp += lista.get(i);
        }
        
        if (temp != n){
            return false;
        }
        return true;
    }
}
