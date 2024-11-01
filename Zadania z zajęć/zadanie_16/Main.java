/* Stwórz klasę Calculator, która posiada podstawowe metody matematyczne: 
   dodawanie, odejmowanie, mnożenie i dzielenie. Zaimplementuj te metody 
   jako metody statyczne. Utwórz drugą klasę, w której przetestujesz te metody 
   bez tworzenia instancji klasy Calculator.   */

public class Main {
    public static void main(String[] args) {
        System.out.println(Calculator.add(3,3));
        System.out.println(Calculator.sub(3,3));
        System.out.println(Calculator.multiply(3,3));
        System.out.println(Calculator.devide(3,3));
    }
}
