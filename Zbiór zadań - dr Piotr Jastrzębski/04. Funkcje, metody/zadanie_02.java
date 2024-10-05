/* Napisz statyczną metodę, której argumentem jest dodatnia liczba
   całkowita n (n > 2). Metoda ma zwrócić największą liczbę pierwszą
   mniejszą niż n. Stwórz przypadek testowy dla tej metody. */


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbe: ");
        int dane = scanner.nextInt();
        System.out.println(funkcja(dane));
    }

    static ArrayList<Integer> Dzielniki(int a){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for (int i = 1; i < a+1; i++) {
            if(a % i == 0){
                lista.add(i);
            }
        }
        return lista;
    }
    static int CzyPierwsza (int a, ArrayList<Integer> lista){
        if (lista.size() != 2){
            return 0;
        }
        else{
            if (lista.getFirst() != 1 && lista.getLast() != a){
                return 0;
            }
        }
        return 1;
    }
    static int funkcja(int a){
        ArrayList<Integer> lista2 = new ArrayList<Integer>();

        for (int i = 1; i < a; i++) {
            if ( CzyPierwsza(i,Dzielniki(i)) == 1){
                lista2.add(i);
            }
        }
        return lista2.getLast();
    }
}
