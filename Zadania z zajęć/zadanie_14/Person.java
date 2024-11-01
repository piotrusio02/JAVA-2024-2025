/* Zaprojektuj klasę Person, która będzie zawierać dwa pola: firstName, lastName. 
Zaimplementuj konstruktor, który przyjmuje dwa argumenty odpowiadające polom klasy. 
Nazwy parametrów muszą być takie same jak nazwy pól. Spróbuj przypisać wartości do pól 
klasy bez używania słowa kluczowego this. Czy jest to możliwe? Jeżeli nie, to dlaczego? */


public class Person {
    String firstName;
    String lastName;

    Person(String firstName,String lastName){
        firstName = firstName;
        lastName = lastName;
        /* takie przypisanie sprawi że kompiltor nie przypisze paramterów do pól. 
        Na przykład przy próbie wypisania zamiast dostać Adam Małysz, dostaniemu Null Null*/
    }
}
