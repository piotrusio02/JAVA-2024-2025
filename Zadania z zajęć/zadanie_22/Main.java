/* Wykonaj poniższe czynności:
    - Stwórz klasę Results (wyniki testu) z prywatnymi polami: 
     firstName, lastName oraz results (jako tablica typu int). 
    - Dodaj konstruktor, który przyjmuje firstName, lastName 
     oraz rozmiar tablicy jako argumenty. 
    - Dodaj metody dostępowe (gettery i settery) oraz metodę 
     addResult(int index, int result), która dodaje wynik 
     testu na podanym indeksie. 
    - Dodaj również metodę averageResult() do obliczania i zwracania średniego wyniku.
    - Dodaj metodę toString(), która zwraca informacje o uczniu, jego wynikach oraz 
     zawartość tablicy results w formacie: "Results for [firstName] [lastName]: 
     Average Score = [averageResult], Results: [result1, result2, ...]. ". 
    - Ponadto dodaj metodę equals(), która porównuje dwa obiekty klasy Results
     na podstawie ich pól firstName, lastName oraz zawartości tablicy results. 
     Dwa obiekty są uważane za identyczne, jeśli wszystkie pola i wyniki testów w tablicach są takie same. 
    - Dodaj także metodę hashCode(), która generuje kod hash dla odpowiedniego obiektu. 
     Metoda ta powinna być zgodna z metodą equals()  */

public class Main {
    public static void main(String[] args) {
        Results r1 = new Results("Janek","Pacyk",4);
        Results r2 = new Results("Kuba","Kolek",5);
        Results r3 = new Results("Janek","Pacyk",4);
        r1.addResult(0,2);
        r1.addResult(1,3);
        r1.addResult(2,2);
        r1.addResult(3,3);
        r3.addResult(0,2);
        r3.addResult(1,3);
        System.out.println(r1.toString());

        System.out.println(r1.equals(r3));
    }
}
