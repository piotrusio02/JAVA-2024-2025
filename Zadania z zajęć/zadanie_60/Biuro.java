/* Wykonaj poniższe czynności:
Stwórz interfejs Printer z metodą drukuj(String tekst).
Utwórz klasę StandardowyPrinter, która implementuje Printer i wypisuje tekst na konsolę.
Utwórz klasę Biuro, która posiada prywatne pole typu Printer. W konstruktorze Biuro przyjmij 
Printer jako argument i przypisz go do pola. Dodaj metodę drukujDokument(String tekst), 
która będzie delegować zadanie drukowania do obiektu klasy Printer.
 */

public class Biuro {
    private Printer printer;

    public Biuro(Printer printer) {
        this.printer = printer;
    }

    public void drukujDokument(String tekst){
        printer.drukuj(tekst);
    }

    public static void main(String[] args) {
        StandardowyPrinter st = new StandardowyPrinter();
        Biuro biuro = new Biuro(st);
        biuro.drukujDokument("przykładowy druk");
    }
}
