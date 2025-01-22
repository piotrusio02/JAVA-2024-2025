/* Zaprojektuj interfejs Sensor z trzema metodami abstrakcyjnymi: readValue() 
zwracającą double, getStatus() zwracającą String oraz reset() zwracającą void. 
Stwórz dwie klasy TemperatureSensor i PressureSensor, które implementują ten interfejs. 
W klasie SensorTest przetestuj działanie metod dla obiektów z obu klas.
 */

public class SensorTest {

        public static void main(String[] args) {
            TemperatureSensor ts = new TemperatureSensor();
            PressureSensor ps = new PressureSensor();
            ps.reset();
            ts.reset();
            System.out.println(ps.readValue());
            System.out.println(ts.readValue());
            System.out.println(ps.getStatus());
            System.out.println(ts.getStatus());

        }
    }

