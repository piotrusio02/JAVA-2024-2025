/* treść zadania */

/* Main.java */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> liczby = new ArrayList<Double>();
        for (int i = 0; i < 15; i++) {
            liczby.add((double) i);
        }
        System.out.println(listyTablicoweTrening.average(liczby));
    }
}

/* listyTablicoweTrening.java */
import java.util.ArrayList;

public class listyTablicoweTrening {
    public static Double average(ArrayList<Double> lista) {
        Double temp = 0.0;
        for (int i = 0; i < lista.size(); i++) {
            temp += lista.get(i);
        }
        return temp/lista.size();
    }
}
