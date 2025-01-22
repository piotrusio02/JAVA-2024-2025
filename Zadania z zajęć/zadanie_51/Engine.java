public class Engine implements Cloneable {
    int power;
    String type;
    int serialNumber;

    public Engine(int power, String type, int serialNumber) {
        this.power = power;
        this.type = type;
        this.serialNumber = serialNumber;
    }

    @Override
    protected Engine clone() throws CloneNotSupportedException {
        return (Engine) super.clone();
    }
}
