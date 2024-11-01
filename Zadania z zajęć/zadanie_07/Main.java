/* Napisz statyczną metodę, która przyjmuje napis jako argument
  i zwraca ten napis z zamienioną pierwszą i ostatnią literą. 
  Stwórz przypadek testowy. */

public class Main {
    public static void main(String[] args) {
        String napis1 = "piesek";
        System.out.println(method(napis1));

    }

    static String method(String napis){
        char first = napis.charAt(0);
        char last = napis.charAt(napis.length()-1);
        String temp = last + napis.substring(1,napis.length()-1) + first;
        return temp;
    }
}
