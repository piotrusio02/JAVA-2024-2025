public class Laptop extends ElectronicDevice{
    public Laptop(String manufacturer, String model, int productionYear) {
        super(manufacturer, model, productionYear);
    }

    @Override
    public void turnOn() {
        System.out.println("laptop włączony");
    }

    @Override
    public void turnOff() {
        System.out.println("laptop wyłączony");
    }
}
