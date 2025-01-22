/* Stwórz klasę PointC reprezentującą punkt na płaszczyźnie 2D z polami x i y. 
  Następnie, stwórz rekord PointR z tymi samymi polami. Dodaj metody umożliwiające 
  konwersję z instancji klasy na rekord i odwrotnie. Stwórz przypadek testowy. */

public class Main {
    public static void main(String[] args) {
        PointC c1 = new PointC(5,4);

        System.out.println(c1.toString());
        System.out.println(c1.toPointR());
        System.out.println("=====");

        PointR r1 = new PointR(19,30);
        System.out.println(r1.toString());
        System.out.println(r1.toPointC());
    }
}
