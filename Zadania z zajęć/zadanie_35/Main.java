/* Stwórz rekord BookDTO, który reprezentuje książkę w sklepie internetowym. 
Powinien zawierać takie informacje jak title, author, price i yearOfPublication. 
Następnie stwórz kilka instancji tego rekordu, reprezentujących różne książki. */

public class Main {
    public static void main(String[] args) {
        BookDTO book1 = new BookDTO("tytul1", "autor1", 33.45,2005);
        BookDTO book2 = new BookDTO("tytul1", "autor1", 33.45,2005);
        BookDTO book3 = new BookDTO("tytul3", "autor3", 33.45,2005);

        System.out.println(book1);
        System.out.println(book2.price());
        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book3));
    }
}
