/* Napisz statyczną metodę, która p
rzyjmuje napis jako argument i zwraca 
ten napis w odwrotnej kolejności. Stwórz przypadek testowy. */

public class Main {
    public static void main(String[] args) {
        String slowo = "Zadanie";
        System.out.println(odwrocNapis(slowo));
    }
    static String odwrocNapis(String napis){
        StringBuilder odwrocony = new StringBuilder();
        for (int i = napis.length()-1; i >= 0 ; i--) {
            odwrocony.append(napis.charAt(i));
        }
        return odwrocony.toString();
    }
}
