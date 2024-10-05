/* Napisz statyczną metodę minimumValue, która przyjmuje tablicę liczb 
   całkowitych jako argument i zwraca najmniejszą liczbę w tablicy. 
   Przyjmij, że tablica zawsze będzie miała co najmniej jeden element. 
   Jeżeli tablica zawiera tylko jeden element, zwróć ten element. Stwórz przypadek testowy. */


public class Main {
    public static void main(String[] args) {
        int[] tab = {11, 200, 30, 40, 15, 60, 70, 80, 93, 10};
        System.out.println(minimumValue(tab));

    }
    static int minimumValue(int[] tab){
        int temp = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if(temp > tab[i]){
                temp = tab[i];
            }
        }
        return temp;
    }
}
