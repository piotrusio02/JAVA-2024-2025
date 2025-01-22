public class TemperatureSensor implements Sensor{
    @Override
    public double readValue() {
        return 44.3;
    }

    @Override
    public String getStatus() {
        return "Czuwanie";
    }

    @Override
    public void reset() {
        System.out.println("Zresetowano urzadzenie");
    }
}
