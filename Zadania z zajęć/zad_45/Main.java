/*Napisz klasę Book, która zawiera pola: title (typu String), 
numberOfPages (typu int) i publicationDate (typu LocalDate). 
Zaimplementuj interfejs Comparable w taki sposób, aby obiekty 
klasy Book były sortowane malejąco według liczby stron. Stwórz 
tablicę 4 obiektów klasy Book i posortuj ją według sprecyzowanego kryterium.
 */

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book[] books = {new Book("tytul1",200, LocalDate.of(2015,10,20)),
                new Book("tytul1",400, LocalDate.of(2015,10,20)),
                new Book("tytul1",100, LocalDate.of(2015,10,20)),
                new Book("tytul1",500, LocalDate.of(2015,10,20))
        };

        for(Book element : books){
            System.out.println(element.toString());
        }
        Arrays.sort(books);
        System.out.println("===");
        for(Book element : books){
            System.out.println(element.toString());
        }
    }
}
