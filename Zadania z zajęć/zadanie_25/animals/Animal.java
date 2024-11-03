/* Stwórz dwa różne pakiety: animals i mammals. 
   W pakiecie animals stwórz klasę bazową Animal 
   z chronionym polem species i prywatnym polem age. 
   W pakiecie mammals stwórz klasę Dog, która dziedziczy 
   po klasie Animal. Spróbuj odnieść się w klasie Dog do 
   obu pól z klasy bazowej i zauważ, które z nich są dostępne. */

package animals;

public class Animal {
    protected String species;
    private Integer age;

    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }
}
