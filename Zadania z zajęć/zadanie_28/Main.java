/* Stwórz klasę bazową Base z metodą statyczną info, która wypisuje 
   “This is the base class.”. Następnie stwórz klasę potomną Child i 
   próbuj przesłonić metodę statyczną info tak, by wypisywała 
   “This is the child class.”. Zastanów się nad zachowaniem tak 
   przesłoniętych metod i dlaczego takie przesłanianie jest inaczej traktowane. */

public class Main {
    public static void main(String[] args) {
        Base.info();
        Child.info();
    }
}
