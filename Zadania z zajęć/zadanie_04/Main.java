/*Napisz statyczną metodę countZeros, która przyjmuje listę tablicową 
liczb całkowitych jako argument i zwraca liczbę wystąpień zera w liście 
tablicowej. Na przykład, dla [0, 1, 2, 0, 3, 0, 4], funkcja powinna zwrócić 3. 
Stwórz przypadek testowy.*/

/*Main.java*/
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> liczby = new ArrayList<Integer>(Arrays.asList(0,1,2,0,3,0,4));
        System.out.println(ListyTrening.countZeros(liczby));
    }
}


