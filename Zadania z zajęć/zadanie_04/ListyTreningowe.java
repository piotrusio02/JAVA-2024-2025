
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
