/* Napisz statyczną metodę oddElementsSum, która przyjmuje listę 
   tablicową liczb całkowitych jako argument i zwraca sumę wszystkich 
   nieparzystych liczb w liście tablicowej. Jeżeli w liście tablicowej 
   nie ma żadnych nieparzystych liczb, funkcja powinna zwrócić 0. Stwórz przypadek testowy.
 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> tab = new ArrayList<Integer>();
        tab.add(1);
        tab.add(2);
        tab.add(3);
        tab.add(4);
        tab.add(5);
        System.out.println(oddElementsSum(tab));
    }

    public static int oddElementsSum(ArrayList<Integer> tab){
        int temp = 0;
        for(int e : tab){
            if(e % 2 != 0){
                temp += e;
            }
        }
        return temp;
    }
}
