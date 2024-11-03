import java.util.ArrayList;
import java.util.Objects;

public class Laptop extends Computer{
    Double weight;

    public Laptop(String manufacturer, String model, ArrayList<Double> partsPrices, Double weight) {
        super(manufacturer, model, partsPrices);
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "weight=" + weight +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", partsPrices=" + partsPrices +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(weight, laptop.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight);
    }
}
