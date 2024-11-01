public class Calculator {
    public static double add(int a, int b){
        return a+b;
    }
    public static double sub(int a, int b){
        return a-b;
    }
    public static double multiply(int a, int b){
        return a*b;
    }
    public static double devide(int a, int b){
        if(b != 0){
            return a / b;
        }
        return 0.0;
    }
}
