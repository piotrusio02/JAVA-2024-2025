/* Zdefiniuj abstrakcyjną klasę ComputerGraphic z polami width, 
height typu int oraz fileName typu String. Dodaj abstrakcyjne metody 
loadFile() i saveFile(). Następnie zdefiniuj klasy Bitmap i Vector, 
które dziedziczą po klasie ComputerGraphic i implementują metody loadFile()
oraz saveFile(). Stwórz listę tablicową odpowiednich 5 obiektów i wywołaj dla nich napisaną metodę.
 */

public class Main {
    public static void main(String[] args) {
        ComputerGraphic[] cg1 = {new Bitmap(3,4,"string"),
                new Bitmap(5,4,"string2"),
                new Vector(6,2,"string3"),
                new Bitmap(9,3,"string4"),
                new Bitmap(1,8,"string5")};

        for(ComputerGraphic element : cg1){
            element.loadFile();
            element.saveFile();
        }
    }
}
