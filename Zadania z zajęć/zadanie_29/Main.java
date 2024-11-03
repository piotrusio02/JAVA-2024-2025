/* Stwórz klasę bazową o nazwie Animal z polem name oraz konstruktor 
   z domyślnym przypisaniem nazwy do “Unknown”. Następnie stwórz klasę 
   Dog, która dziedziczy po klasie Animal. Nie twórz w niej dodatkowego 
   konstruktora. Sprawdź, jakie zwierzę zostanie utworzone, gdy stworzysz 
   nową instancję klasy Dog (Użyj metody getClass().getName() ). */

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.getClass().getName());
        System.out.println(dog.getName());
    }
}
