/* Napisz klasę Person, która będzie miała pola: firstName, 
   lastName i age. Zdefiniuj w niej dwa konstruktory, jeden 
   przyjmujący wszystkie trzy parametry, a drugi tylko imię i 
   nazwisko. Drugi konstruktor powinien wywołać pierwszy, 
   przekazując mu domyślną wartość wieku jako 0. */

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Janek","Kowalczyk",15);
        Person p2 = new Person("Adam", "Nawałka");
        p1.temp();
        p2.temp();
    }
}
