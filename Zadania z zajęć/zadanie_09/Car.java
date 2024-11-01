public class Car {
    String brand;
    String model;
    Integer speed;

    Car(String brand, String model, Integer speed){
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    public void accelerate(int value){
        this.speed += value;
        System.out.println("Twoja prędkość wynosi: "+speed);
    }
    public void decelarate(int value){
        this.speed -= value;
        System.out.println("Twoja prędkość wynosi: "+speed);
    }
}
