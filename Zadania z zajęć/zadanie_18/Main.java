/* Stwórz klasę ShapeFactory, która posiada metody statyczne do 
   tworzenia różnych figur geometrycznych, takich jak koła, kwadraty 
   czy trójkąty. Następnie stwórz klasę testową, w której wykorzystasz 
   te metody do stworzenia różnych figur, bez potrzeby tworzenia instancji klasy ShapeFactory.  */

public class Main {
    public static void main(String[] args) {
        System.out.println(shapeFactory.circle(2));
        System.out.println(shapeFactory.square(3.5));
        System.out.println(shapeFactory.triangle(3.6,7));
    }
}
