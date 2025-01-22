/* W jednym projekcie wykonaj czynności:
A. Stwórz abstrakcyjną klasę Product zawierającą publiczną abstrakcyjną metodę 
getPrice(), która nie przyjmuje argumentów i zwraca double. Klasę umieść w pakiecie store.
B. Utwórz dwie klasy pochodne od Product: Book i Clothing. W obu klasach nadpisz metodę getPrice(). 
Dla Book niech zwraca cenę 29.99, a dla Clothing niech zwraca cenę 59.99.
C. W klasie TestProduct w pakiecie store utwórz tablicę typu Product i zainicjuj ją 5 instancjami
 Book i Clothing. Iteruj po tablicy wywołując metodę getPrice() dla każdego produktu (wyświetl ceny na standardowym wyjściu).
 */

package store;

public class TestProduct {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Clothing();
        products[1] = new Book();
        products[2] = new Clothing();
        products[3] = new Book();
        products[4] = new Clothing();

        for (Product product : products) {
            System.out.println("Cena produktu: " + product.getPrice());
        }
    }
}
