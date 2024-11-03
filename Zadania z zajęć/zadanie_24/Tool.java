/* Stwórz klasę Tool z chronionym konstruktorem, który 
   przyjmuje nazwę narzędzia. Następnie stwórz klasę potomną 
   Hammer, która dziedziczy po klasie Tool. W klasie Hammer stwórz 
   konstruktor, który korzysta z konstruktora klasy bazowej. 
   Zastanów się, dlaczego używając modyfikatora private dla konstruktora 
   klasy bazowej, taki scenariusz nie byłby możliwy. */

public class Tool {
    String tools;

    protected Tool(String tools){
        this.tools = tools;
    }
}
