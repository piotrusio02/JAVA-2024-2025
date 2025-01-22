/* Napisz klasę Client, która zawiera pola: name (typu String), 
clientNumber (typu int) i lastLogin (typu Date). Zaimplementuj interfejs 
Comparable w taki sposób, aby obiekty klasy Client były sortowane malejąco 
według daty ostatniego logowania. Stwórz listę tablicową 5 obiektów klasy 
Client i posortuj ją według sprecyzowanego kryterium. */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ArrayList<Client> klienci = new ArrayList<>();
        klienci.add(new Client("Anna",1936748205, new Date(2000-2024,3,13)));
        klienci.add(new Client("Maciej",1738406285, new Date(2000-2024,8,11)));
        klienci.add(new Client("Bartosz", 1294051783, new Date(2000-2024,7,9)));
        klienci.add(new Client("Tymoteusz", 1203648166, new Date(2000-2024,5,8)));
        klienci.add(new Client("Karolina", 1039285739, new Date(2000-2024,1,3)));

        for(Client klienteria : klienci){
            System.out.println(klienteria);
        }
        Collections.sort(klienci);

        System.out.println("===");
        for(Client klienteria : klienci){
            System.out.println(klienteria);
        }


    }
}
