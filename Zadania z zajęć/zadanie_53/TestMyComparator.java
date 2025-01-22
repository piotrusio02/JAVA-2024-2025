/* Stwórz interfejs o nazwie MyComparator, który będzie zawierał metodę 
compare(int a, int b): int. Metoda ta powinna zwrócić -1, jeśli a < b, 
0 jeśli a == b i 1 jeśli a > b. Następnie stwórz klasę TestMyComparator, 
która będzie implementować ten interfejs. W klasie tej zaimplementuj 
metodę compare zgodnie z jej opisem.
 */

public class TestMyComparator implements MyComparator{
    @Override
    public int compare(int a, int b) {
        return Integer.compare(a,b);
    }

    public static void main(String[] args) {
        TestMyComparator tmc = new TestMyComparator();
        System.out.println(tmc.compare(8,8));
    }
}
