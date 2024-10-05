/* Napisz statyczną metodę, której argumentem są cztery dodatnie liczby
   całkowite a, b, c, d. Metoda zwraca ile liczb całkowitych z przedziału (a,b)
   jest podzielnych przez c i nie jest podzielnych przez d. W przypadku braku takich
   liczb, zwróć zero. Stwórz przypadek testowy dla tej metody. */


public class Main {
    public static void main(String[] args) {
        System.out.println(metoda(1,12,2,3));
    }
    static int metoda(int a, int b, int c, int d){
        int wynik = 0;
        for (int i = a; i <= b; i++) {
            if(i % c == 0 && i % d != 0){
                wynik += 1;
            }
        }
        return wynik;
    }
}
