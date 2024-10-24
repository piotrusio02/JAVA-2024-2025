/*Używając metody charAt, napisz statyczną metodę, 
  która sprawdza, czy dany napis zaczyna się i kończy 
  tym samym znakiem. Stwórz przypadek testowy. */

public class Main {
    public static void main(String[] args) {
        String napis = "kotek";
        String napis1 = "piesek";
        System.out.println(method(napis));
        System.out.println(method(napis1));
    }

    static Boolean method(String napis){
        if (napis.charAt(0) == napis.charAt(napis.length()-1)){
            return true;
        }
        return false;

    }
}
