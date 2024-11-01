public class shapeFactory {
    public static Double circle(double radius){
        return 3.14 * radius * radius;
    }
    public static Double square(double side){
        return side * side;
    }
    public static Double triangle(double a, double b){
        return 0.5 * a * b;
    }
}
