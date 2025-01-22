public class PressureSensor implements Sensor{
    @Override
    public double readValue() {
        return 12;
    }

    @Override
    public String getStatus() {
        return "Sprawdzam ciśnienie";
    }

    @Override
    public void reset() {
        System.out.println("reset");
    }
}
