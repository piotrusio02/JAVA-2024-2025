/*Napisz klasę Song z polami title (typu String), artist (typu String) 
oraz duration (typu int). Zaimplementuj dwie klasy implementujące generyczny 
interfejs Comparator: DurationComparator do porównywania obiektów po polu 
duration (od najkrótszej do najdłuższej piosenki) oraz ArtistTitleComparator 
do porównywania obiektów po polu artist (alfabetycznie od A do Z) i w przypadku 
równości po polu title. Stwórz tablicę 5 obiektów klasy Song i posortuj ją zgodnie 
z oboma kryteriami (najpierw po długości utworu,a przy równości po artyście i tytule).
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Song[] lista = new Song[5];
        lista[0] = new Song("atytul", "bartysta", 15);
        lista[1] = new Song("ctytul", "cartysta", 12);
        lista[2] = new Song("dtytul", "dartysta", 10);
        lista[3] = new Song("btytul", "cbartysta", 1);
        lista[4] = new Song("atytul", "aartysta", 10);


        for(Song element : lista){
            System.out.println(element.toString());
        }
        System.out.println("===");
        Arrays.sort(lista, new DurationComparator());
        Arrays.sort(lista, new ArtistTittleComparator());
        for(Song element : lista){
            System.out.println(element.toString());
        }
    }

}
