/* Napisz statyczną metodę, która jako argument otrzymuje dodatnią 
   liczbę całkowitą n i zwraca liczbę 7 ^ -n. Nie korzystaj z żadnych 
   gotowych funkcji bibliotecznych ani wbudowanych wewnątrz tej funkcji 
   poza instrukcjami wejścia/wyjścia. Stwórz przypadek testowy. */


public class Main {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(metoda(n));
    }
    static Double metoda(int n){
        int temp = 1;
        for (int i = 1; i <= n; i++) {
            temp *= 7;
        }
        Double wynik = 1.00 / temp;
        return wynik;
    }
}
