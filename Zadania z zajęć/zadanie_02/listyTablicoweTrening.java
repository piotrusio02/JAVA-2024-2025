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
