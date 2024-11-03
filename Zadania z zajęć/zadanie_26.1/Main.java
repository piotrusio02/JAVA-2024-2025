/* Stwórz klasę bazową Vehicle z metodą drive, 
   która wypisuje “The vehicle is moving.”. Następnie 
   stwórz klasę potomną Car, która nadopisuje metodę drive 
   tak, by wypisywała “The car is moving.”. Utwórz obiekt 
   klasy Car i wywołaj jego metodę drive, aby zaobserwować wynik. */

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        car.drive();
        vehicle.drive();
    }
}
