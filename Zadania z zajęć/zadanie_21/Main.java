/* Wykonaj poniższe czynności:
  - Zdefiniuj klasę Vehicle, która posiada następujące pola: brand, model i yearOfProduction.
  - Napisz konstruktor, który przyjmuje trzy argumenty i waliduje je przed przypisaniem do 
   odpowiednich pól.
  - Rok produkcji (yearOfProduction) nie powinien być większy od aktualnego roku. W przypadku p
   odania wartości większej, ustaw rok produkcji na aktualny rok.
  - Pola brand i model nie powinny być puste ani równać się null. W przypadku podania pustego 
   napisu lub null dla tych pól, ustaw odpowiednio pusty napis.
  - Dodaj metodę toString(), która zwraca informacje o pojeździe w formacie: "Vehicle: [brand] 
   [model], Year: [yearOfProduction].".
  - Dodaj metodę equals(), która porównuje dwa pojazdy na podstawie ich pól brand, model i 
   yearOfProduction.
  - Dodaj metodę hashCode(), która generuje kod hash dla odpowiedniego obiektu. Metoda ta powinna 
   być zgodna z metodą equals() */


public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Audi", "a3", 2022);
        Vehicle v2 = new Vehicle("BMW", "7",2024);
        Vehicle v3 = new Vehicle("", "",2028);
        System.out.println(v1.toString());
        System.out.println(v3.toString());
        System.out.println(v1.equals(v2));
    }
}
