/* Napisz statyczną metodę, która przyjmuje napis jako 
   argument i zwraca ten napis z zamienioną pierwszą i 
   ostatnią literą. Stwórz przypadek testowy. */


public class Main {
    public static void main(String[] args) {
        String napis = "kowal";
        System.out.println(method(napis));
    }
    static String method(String napis){
        char[] temp = new char[napis.length()];
        temp[0] = napis.charAt(napis.length()-1);
        temp[napis.length()-1] = napis.charAt(0);

        for(int i = 1; i < napis.length()-1;i++){
            temp[i] = napis.charAt(i);
        }
        return new String(temp);
    }
}
