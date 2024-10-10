/* tresc zadania */

/*Main.java*/
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> liczby = new ArrayList<Integer>();
        for (int i = 0; i < 15; i++) {
            liczby.add(i);
        }
        System.out.println(listyTablicoweTrening.minimumValue(liczby));
    }
}


/*listyTablicoweTrening.java*/
import java.util.ArrayList;

public class listyTablicoweTrening {
    public static int minimumValue(ArrayList<Integer> lista){
        int minimum = lista.getFirst();
        for (int i = 1; i < lista.size(); i++) {
            if(minimum > lista.get(i)){
                minimum = lista.get(i);
            }

        }
        return minimum;
    }
}
