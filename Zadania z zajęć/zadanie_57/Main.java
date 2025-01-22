/* Stwórz prostą klasę generyczną Box, która może przechowywać obiekt dowolnego typu. 
Klasa powinna zawierać metodę set, aby ustawić obiekt, oraz metodę get, aby go pobrać.
 */

public class Main {
    public static void main(String[] args) {
        String napis = "Cześć!";
        int a = 33;
        Box<String,Integer> box = new Box<>(napis,a);
        System.out.println(box.getValue1());
        System.out.println(box.toString());
    }
}
