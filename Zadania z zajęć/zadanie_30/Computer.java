import java.util.ArrayList;
import java.util.Objects;

public class Computer {
    String manufacturer;
    String model;
    ArrayList<Double> partsPrices;

    public Computer(String manufacturer, String model, ArrayList<Double> partsPrices) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.partsPrices = partsPrices;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public ArrayList<Double> getPartsPrices() {
        return partsPrices;
    }

    public void setPartsPrices(ArrayList<Double> partsPrices) {
        this.partsPrices = partsPrices;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", partsPrices=" + partsPrices +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(manufacturer, computer.manufacturer) && Objects.equals(model, computer.model) && Objects.equals(partsPrices, computer.partsPrices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, model, partsPrices);
    }
}
