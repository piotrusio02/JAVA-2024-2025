/* Stwórz klasę Engine (Silnik) z polami: power (moc), type (typ silnika),
 serialNumber (numer seryjny). Dodaj konstruktor parametryczny oraz zaimplementuj interfejs Cloneable.

Stwórz klasę Car (Samochód). Klasa Car powinna mieć pola: make (marka), model 
(model), engine typu Engine (silnik). Dodaj konstruktor parametryczny oraz zaimplementuj interfejs Cloneable.
 */

public class Car implements Cloneable{
    String make;
    String model;
    Engine engine;

    public Car(String make, String model, Engine engine) {
        this.make = make;
        this.model = model;
        this.engine = engine;
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }
}
