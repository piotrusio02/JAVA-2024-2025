/* Utwórz program, który tworzy jednowymiarową tablicę 30 liczb 
   całkowitych. Następnie poproś użytkownika, aby podał dowolną 
   liczbę. Program powinien wyświetlić informację, czy podana 
   liczba znajduje się w tablicy, a także ile razy się w niej pojawia. */


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] tab = new int[11];
        for (int i = 0; i < tab.length; i++) {
            int temp = rand.nextInt(1,30);
            tab[i] = temp;
        }

        int wpisz = scanner.nextInt();
        int ile = 0;
        
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] == wpisz){
                ile += 1;
            }
        }
        
        if (ile <= 0){
            System.out.println("taka liczba nie wystepuje");
        }
        else{
            System.out.println("Ta liczba się pojawiła. " + ile);
        }
    }
}
