/* Napisz program, który tworzy listę tablicową 10 liczb 
   całkowitych, a następnie wyświetla je w konsoli w porządku 
   odwrotnym do wprowadzenia. */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> array = new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,0.0));
        Collections.reverse(array);
        System.out.println(array);
    }
}
