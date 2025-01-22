/*Napisz klasę Athlete z dwoma polami: name (String) i lapTimes 
(lista tablicowa zmiennych typu int, reprezentująca czas w sekundach 
potrzebny na przebiegnięcie okrążenia podczas różnych prób). Zaimplementuj 
interfejs Cloneable i nadpisz metodę clone(), aby móc klonować obiekty tej 
klasy. W metodzie main() utwórz obiekt Athlete, sklonuj go, a następnie zmień 
czas na pozycji 3 oryginalnego sportowca. Wyświetl czasy obu sportowców, aby 
zobaczyć, czy są niezależne.
 */

public class Main {
    public static void main(String[] args) {
        Athlete a1 = new Athlete("Janek", new int[]{1, 2, 3, 4});
        Athlete a2 = null;

        try{
            a2 = a1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(a1);
        System.out.println(a2);
        a1.lapTimes = new int[]{4, 3, 2, 1};
        System.out.println(a1);
    }
}
