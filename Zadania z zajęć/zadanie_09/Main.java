/* Stwórz klasę Car z polami: brand, model i speed. 
  Napisz metody accelerate(int value) i decelerate(int value), 
  które odpowiednio zwiększają i zmniejszają prędkość o podaną wartość. 
  Stwórz przypadek testowy, aby wywołać każdą metodę co najmniej jeden raz. */

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Audi","a3",200);
        car.accelerate(100);
        car.decelarate(50);

    }
}
