/* Utwórz klasę Car z prywatną metodą engineFailure(). Spróbuj wywołać tę metodę z zewnątrz klasy. */

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
       // car.engineFailure() wywołuje błąd. Po za klasą ta metoda nie jest dostępna
        car.temp();
    }
}
