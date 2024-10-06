/* Napisz statyczną metodę, która usuwa wszystkie spacje
   z danego napisu. Stwórz przypadek testowy. */


public class Main {
    public static void main(String[] args) {
        String napis = "kot ek";
        remove(napis);
    }
    static void remove(String napis){
        char[] temp = new char[napis.length()];
        int index = 0;
        for(int i = 0; i< napis.length(); i++){
            if(napis.charAt(i) != ' '){
                temp[index++] = napis.charAt(i);
            }
        }
        System.out.println(new String(temp,0,index));
    }
}
