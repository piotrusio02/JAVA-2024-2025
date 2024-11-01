/* Stwórz klasę Time z polami: hours i minutes. Napisz metodę addTime(Time otherTime), 
   która dodaje do bieżącego czasu czas podany jako argument i zwraca nowy obiekt klasy 
   Time. Zadbaj o to, aby minuty i godziny nie przekraczały odpowiednio 59 i 23. Stwórz 
   przypadek testowy, aby wywołać metodę co najmniej jeden raz. */

public class Main {
    public static void main(String[] args) {
        Time t1 = new Time(5,55);
        Time t2 = new Time(2,35);
        Time t3 = t1.addTime(t2);
        System.out.println(t3.hours+":"+t3.minutes);
    }
}
