/* Stwórz klasę Calculator z metodą add, która przyjmuje dwa argumenty 
  typu int i zwraca ich sumę. Następnie stwórz klasę potomną ExtendedCalculator, 
  która nadpisuje metodę add w taki sposób, by przyjmowała trzy argumenty typu 
  int i zwracała ich sumę. Zastanów się, czy to faktycznie nadpisywanie metody, czy może coś innego. */

public class Main {
    public static void main(String[] args) {
        System.out.println(ExtendedCalculator.add(3,2,5));
        System.out.println(ExtendedCalculator.add(2,3));
    }
}
