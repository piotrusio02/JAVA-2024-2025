/* Napisz statyczną metodę, która przyjmuje napis jako argument 
   i zwraca ten napis w odwrotnej kolejności. Stwórz przypadek testowy. */


public class Main {
    public static void main(String[] args) {
        String napis = "kobyła ma mały bok";
        System.out.println(metoda(napis));
    }
    static String metoda(String napis){
        String temp = "";
        for (int i = napis.length() -1; i >= 0; i--) {
            temp += napis.charAt(i);
        }
        return temp;
    }
}
