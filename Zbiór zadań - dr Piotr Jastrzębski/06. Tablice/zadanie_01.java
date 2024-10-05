/* Napisz program, który tworzy tablicę jednowymiarową 
   10 liczb całkowitych, a następnie wyświetla je w 
   konsoli w porządku odwrotnym do wprowadzenia. */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tab = new int[10];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = scanner.nextInt();
        }
        for (int j = tab.length - 1; j >= 0; j--) {
            System.out.print(tab[j] + ", ");
        }
    }
}

