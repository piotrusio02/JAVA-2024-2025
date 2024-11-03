/* SUtwórz klasę Computer z polami manufacturer, model oraz partsPrices 
   (jako ArrayList typu Double). Utwórz klasy Laptop i Desktop, które dziedziczą 
   po klasie Computer. Klasa Laptop powinna mieć dodatkowe pole weight, a klasa 
   Desktop pole caseType. Dodaj konstruktory, metody gettery i settery, metodę 
   toString(), equals() oraz hashCode() dla każdej z klas. Napisz program testujący 
   zdefiniowane klasy i metody.*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> temp = new ArrayList<Double>();
        temp.add(299.99);
        temp.add(149.99);
        temp.add(599.99);
        Computer c1 = new Computer("Dell","XT",temp);
        Computer c2 = new Computer("Dell","Penta",temp);
        System.out.println(c1.equals(c2));

        Laptop l1 = new Laptop("Dell","Kyoto",temp,2.7);
        Laptop l2 = new Laptop("Dell","Kyoto",temp,2.7);
        System.out.println(l1.toString());
        System.out.println(l1.equals(l2));
        System.out.println(l2.hashCode());

        Desktop d1 = new Desktop("Dell","Pinokio",temp,"harder");
        System.out.println(d1.toString());
    }
}
