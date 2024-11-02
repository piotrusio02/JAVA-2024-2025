/* Wykonaj poniższe czynności:
   - Zdefiniuj klasę Person, która posiada następujące pola: firstName, lastName i age.
   - Napisz konstruktor, który przyjmuje trzy argumenty i waliduje je przed przypisaniem 
    do odpowiednich pól.
   - Wiek osoby (age) nie powinien być ujemny. W przypadku podania wartości ujemnej dla wieku, u
    staw wiek osoby na zero.
   - Pola firstName i lastName nie powinny być puste ani równać się null. W przypadku podania 
    pustego napisu lub null dla tych pól, ustaw odpowiednio pusty napis.
   - Dodaj metodę toString(), która zwraca informacje o osobie w formacie: "Person: [firstName] 
    [lastName], Age: [age].". Zwróć uwagę na wielkość liter i znaki interpunkcyjne.
   - Dodaj metodę equals(), która porównuje dwie osoby na podstawie ich pól firstName, lastName i age. 
    Dwie osoby są uważane za identyczne, jeśli wszystkie trzy pola są takie same.
   - Dodaj metodę hashCode(), która generuje kod hash dla odpowiedniego obiektu. Metoda ta powinna 
    być zgodna z metodą equals() */

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Janek","Kuliga",28);
        Person p2 = new Person("Janek","Kuliga",28);
        Person p3 = new Person("",null,-12);
        System.out.println(p1.toString());
        System.out.println(p3.toString());
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.hashCode());
    }
}
