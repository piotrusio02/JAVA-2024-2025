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

/*ListyTreningowe.java*/
import java.util.ArrayList;

public class ListyTrening {
    public static int countZeros(ArrayList<Integer> liczby) {
        int temp = 0;
        for (int i = 0; i < liczby.size(); i++) {
            if (liczby.get(i) == 0) {
                temp += 1;
            }
        }
        return temp;
    }
}
