import java.time.LocalDate;
import java.util.Objects;

public class Vehicle {
    String brand;
    String model;
    Integer yearOfProduction;

    int year = LocalDate.now().getYear();

    Vehicle(String brand, String model, Integer yearOfProduction){
        if(brand == null || brand.isEmpty()){
            this.brand = "";
        }
        else{
            this.brand = brand;
        }
        if(model == null || model.isEmpty()){
            this.model ="";
        }
        else{
            this.model = model;
        }
        if(yearOfProduction > year){
            this.yearOfProduction = year;
        }
        else{
            this.yearOfProduction = yearOfProduction;
        }
    }

    @Override
    public String toString() {
        return "Vehicle: " + model +" "+ brand + ", Year: "+ yearOfProduction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(brand, vehicle.brand) && Objects.equals(model, vehicle.model) && Objects.equals(yearOfProduction, vehicle.yearOfProduction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearOfProduction);
    }
}
