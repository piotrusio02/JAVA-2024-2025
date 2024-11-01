/* Napisz program, który przyjmuje jako wejście pojedynczy znak oraz liczbę całkowitą n. 
  Używając klasy StringBuilder, zbuduj i wypisz piramidę o wysokości n, gdzie każdy poziom 
  piramidy składa się z podanego znaku. */


public class Main {
    public static void main(String[] args) {
        metoda("*",3);
    }

    public static void metoda(String a, int n){
        StringBuilder temp = new StringBuilder();
        for (int i = 1; i <= n; i++) {

            for (int j = 0; j <n-1; j++) {
                temp.append(" ");
            }
                for (int k = 0; k < 2*i-1; k++) {

                    temp.append(a);
                }
                temp.append("\n");
        }
        System.out.println(temp.toString());
    }
}
