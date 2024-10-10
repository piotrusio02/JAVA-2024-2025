/* Napisz program, który tworzy listę tablicową 
  10 liczb całkowitych, a następnie wyświetla je 
  w konsoli w porządku odwrotnym do wprowadzenia */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listaLiczbCalkowitych = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            listaLiczbCalkowitych.add(i);

        }
//        for (int j = listaLiczbCalkowitych.size()-1; j >= 0; j--) {
//            System.out.print(listaLiczbCalkowitych.get(j) + ", ");
//        }

        for(Integer element : listaLiczbCalkowitych.reversed()){
            System.out.print(element + ", ");
        }

    }
}
