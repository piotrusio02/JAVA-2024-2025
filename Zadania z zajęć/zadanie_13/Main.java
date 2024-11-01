/* Zaprojektuj klasę Square, która posiada pole side oraz konstruktor, 
który umożliwia ustawienie wartości tego pola. Następnie napisz drugi 
onstruktor, który nie przyjmuje żadnych argumentów, a jedynie wywołuje 
pierwszy konstruktor z wartością domyślną 1.*/

public class Main {
    public static void main(String[] args) {
        Square s1 = new Square(5);
        Square s2 = new Square();
        s1.temp();
        s2.temp();
    }
}
