/* Napisz statyczną metodę average, która przyjmuje tablicę liczb 
   zmiennoprzecinkowych jako argument i zwraca średnią arytmetyczną 
   wszystkich liczb w tablicy. Jeżeli tablica jest pusta, zwróć 0. 
   Stwórz przypadek testowy. */


public class Main {
    public static void main(String[] args) {
        Double[] tab = {2.5,2.5,1.0,3.5,5.0};
        System.out.println(average(tab));
        
    }
    static Double average(Double[] tab){
        Double temp = 0.0;
        for (int i = 0; i < tab.length; i++) {
            temp += tab[i];
            
        }
        return (temp/tab.length);
        
    }
}
