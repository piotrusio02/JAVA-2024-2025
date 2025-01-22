/* Napisz generyczną metodę isEqual, która przyjmuje 
dwa dowolne obiekty tego samego typu i zwraca true, 
jeśli są one równe, w przeciwnym razie false.
 */

public class Main {
    public static void main(String[] args) {
        boolean b1 = isEqual(4,5);
        boolean b2 = isEqual("Toyota", "Toyota");
        System.out.println(b1);
        System.out.println(b2);
    }
    public static <T> boolean isEqual(T v1, T v2){
        return v1.equals(v2);
    }
}
