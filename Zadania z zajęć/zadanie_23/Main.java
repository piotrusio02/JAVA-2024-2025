/* Wykonaj kolejno poniższe czynności:
    - Stwórz klasę bazową Person z prywatnym polem firstName oraz 
     chronionym polem lastName. Następnie stwórz klasę Employee, która 
     dziedziczy po klasie Person. W klasie Employee próbuj odnieść się do 
     obu pól i zauważ, które z nich są dostępne.
    - Na bazie klasy Person z poprzedniego podpunktu, stwórz metody dostępowe 
     (gettery) dla obu pól. W klasie Employee stwórz metodę displayData, która 
     korzysta z tych metod dostępowych, aby wypisać informacje o pracowniku. 
     Zastanów się, dlaczego metody dostępowe są używane do dostępu do prywatnych pól. */

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Janek","Grzech");
        e1.displayData();
    }
}
