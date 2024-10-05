/* Napisz statyczną metodę, która sprawdza, czy dany napis jest 
   palindromem. Palindrom to słowo, fraza, liczba lub inny ciąg 
   znaków, który czyta się tak samo od przodu, jak i od tyłu. 
   Stwórz przypadek testowy. */


public class Main {
    public static void main(String[] args) {
        String napis = "kajak";
        System.out.println(palindrom(napis));
    }
    static Boolean palindrom (String napis){
        String temp = "";
        for(int i = napis.length() - 1; i >= 0; i--){
            temp += napis.charAt(i);
        }
        for (int i = 0; i < napis.length(); i++) {
            if(temp.charAt(i) != napis.charAt(i)){
                return false;
            }
        }
        return true;
    }
}

