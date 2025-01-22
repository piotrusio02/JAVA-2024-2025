/* Napisz klasę Product z polami id (typu int), name (typu String) 
oraz price (typu double). Zaimplementuj interfejs Comparator do
porównywania obiektów po polu price (od najniższej do najwyższej ceny),
 a w przypadku równości po polu id. Stwórz listę 5 obiektów klasy Product 
 i posortuj ją zgodnie z opisanym kryterium.
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> produkty= new ArrayList<Product>();
        produkty.add(new Product(1,"nazwa",13.5));
        produkty.add(new Product(2,"nazwa",2.5));
        produkty.add(new Product(3,"nazwa",13.5));
        produkty.add(new Product(4,"nazwa",1.5));

        for(Product produkt : produkty){
            System.out.println(produkt.toString());
        }
        System.out.println("====");
        produkty.sort(new ProductComparator());
        for(Product produkt : produkty){
            System.out.println(produkt.toString());
        }

    }
}
