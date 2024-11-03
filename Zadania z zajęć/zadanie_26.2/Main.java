/* Na bazie klasy Vehicle z poprzedniego podpunktu, w klasie Car, 
   nadpisz metodę drive tak, by wywoływała oryginalną metodę z klasy 
   bazowej i dodatkowo wypisywała informacje specyficzne dla klasy Car.
   Użyj słowa kluczowego super, aby wywołać metodę z klasy bazowej.  */

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}
