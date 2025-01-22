/* Napisz klasę Person z polami firstName (typu String), 
lastName (typu String) oraz birthDate (typu LocalDate). 
Zaimplementuj generyczny interfejs Comparator do porównywania 
obiektów po polu lastName (alfabetycznie od A do Z), a w przypadku 
równości po polu firstName. Stwórz tablicę 5 obiektów klasy Person 
i posortuj ją zgodnie z opisanym kryterium.
 */

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person[] ludzie = new Person[5];
        ludzie[0] = new Person("Adam", "Koczko", LocalDate.now());
        ludzie[1] = new Person("Bartek", "Brutal", LocalDate.now());
        ludzie[2] = new Person("Adam", "Adałka", LocalDate.now());
        ludzie[3] = new Person("Michał", "zelazny",LocalDate.now());
        ludzie[4] = new Person("Michał","Cymbał",LocalDate.now());;

        for(Person person : ludzie){
            System.out.println(person.toString());
        }
        System.out.println("===");
        Arrays.sort(ludzie, new PersonComparator());
        for(Person person : ludzie){
            System.out.println(person.toString());
        }

    }
}
