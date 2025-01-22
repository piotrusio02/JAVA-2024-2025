/* Napisz generyczną metodę printArray, która przyjmuje tablicę elementów 
dowolnego typu i wypisuje wszystkie elementy tej tablicy na standardowe wyjście. 
Metoda powinna być w stanie obsłużyć tablice każdego typu obiektów.
 */

public class Main {
    public static void main(String[] args) {
        Integer[] tab = {1,2,3};
        String[] tab2 = {"as", "es", "ts"};
        printArray(tab);
        printArray(tab2);
    }
    public static <T> void printArray(T[] tab){
        for(T obj : tab){
            System.out.println(obj);
        }
    }
}
