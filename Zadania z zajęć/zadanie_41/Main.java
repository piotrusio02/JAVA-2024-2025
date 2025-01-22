/* Zdefiniuj abstrakcyjną klasę ElectronicDevice z polami manufacturer 
typu String, model typu String oraz productionYear typu int. Dodaj 
abstrakcyjne metody turnOn() i turnOff(). Następnie zdefiniuj klasy 
Smartphone, Television i Laptop, które dziedziczą po klasie ElectronicDevice 
i implementują metody turnOn() oraz turnOff(). Stwórz listę tablicową odpowiednich 
5 obiektów i wywołaj dla nich napisaną metodę.
 */
public class Main {
    public static void main(String[] args) {
        ElectronicDevice[] ed1 = {new Smartphone("Samsung","galaxy",2019),
        new Laptop("hp","lerna",2020),
        new Television("LG","supra",2010)};

        for(ElectronicDevice element : ed1){
            element.turnOn();
            element.turnOff();
        }
    }
}
