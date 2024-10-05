/* Napisz program, który znajdzie wszystkie liczby Amstronga mniejsze
   od 10 000. Liczba Amstronga to taka, której suma jej cyfr podniesionych 
   do potęgi równiej liczbie cyfr w tej liczbie, jest równa samej liczbie. 
   Na przykład 153 jest liczbą Amstronga, ponieważ 1^3 + 5^3 + 3^3 = 153. */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 10000; i++) {
            int temp2 = funkcja(i);
            if(temp2 == i){
                System.out.println(temp2);
            }

        }
    }

    static int funkcja(int a){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        while(a > 0){
            lista.add(a % 10);
            a /= 10;
        }
        double dlugosc = lista.size();
        double wynik = 0;
        for (int i = 0; i < lista.size(); i++) {
            int temp = lista.get(i);
            wynik += Math.pow(temp,dlugosc);
        }
        return (int) wynik;
    }
}
