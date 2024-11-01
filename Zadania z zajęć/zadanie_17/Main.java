/* Stwórz klasę Mathematics, która posiada pole statyczne PI, które 
przechowuje przybliżoną wartość liczby . Upewnij się, że wartość tego pola jest 
niemodyfikowalna. Stwórz przypadek testowy.   */

public class Main {
    public static void main(String[] args) {

        System.out.println(Mathematics.PI);
        // Mathematics.PI += 2.4;
        /* przez final pole PI nie można zmodyfikować. Błąd */
    }
}
