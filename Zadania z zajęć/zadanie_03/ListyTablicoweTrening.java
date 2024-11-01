
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
