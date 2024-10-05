/* Napisz statyczną metodę reverseArray, która przyjmuje tablicę 
   liczb całkowitych jako argument i zwraca nową tablicę, ale z 
   odwróconym porządkiem elementów. Na przykład, dla tablicy 
   [1, 2, 3, 4, 5], funkcja powinna zwrócić [5, 4, 3, 2, 1]. 
   Stwórz przypadek testowy. */


public class Main {
    public static void main(String[] args) {
        int[] tab = {1,2,3,4,5};
        int[] tab2 = reverseArray(tab);
        for (int i = 0; i < tab2.length; i++) {
            System.out.print(tab2[i] + ", ");

        }


    }
    static int[] reverseArray(int[] tab){
        int[] tab2 = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            tab2[i] = tab[tab.length - 1 - i];
        }
        return tab2;
    }
}
