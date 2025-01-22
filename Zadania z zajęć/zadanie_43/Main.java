/* Napisz klasę Employee, która zawiera pola: name (typu String), 
salary (typu double) i employmentDate (typu LocalDate). Zaimplementuj 
interfejs Comparable w taki sposób, aby obiekty klasy Employee były sortowane
rosnąco według pensji. Stwórz listę tablicową 5 obiektów klasy Employee i
posortuj ją według sprecyzowanego kryterium.
 */

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] pracownicy = new Employee[4];
        pracownicy[0] = new Employee("janek",4000, LocalDate.of(2023,12,30));
        pracownicy[1] = new Employee("Stachu",1000, LocalDate.of(2023,12,30));
        pracownicy[2] = new Employee("Marian",8000, LocalDate.of(2023,12,30));
        pracownicy[3] = new Employee("Kacper",2000, LocalDate.of(2023,12,30));

        Arrays.sort(pracownicy);
        for(Employee pracusie : pracownicy)
        {
            System.out.println(pracusie);
        }


    }
}
