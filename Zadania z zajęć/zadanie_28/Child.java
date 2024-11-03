public class Child extends Base{
    public static void info(){
        System.out.println("This is the child class");
    }
    /* Metoda w klasie Child nie zastępuje metody w klasie Base.
       Tworzy nową metodę, która jest dostępna tylko przez referencję do Child.  */
}
