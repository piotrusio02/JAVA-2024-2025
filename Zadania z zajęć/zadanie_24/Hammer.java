public class Hammer extends Tool{

    Hammer(String tools){
        super(tools);
        /* konstruktor protected jest dostępny w tym samym pakiecie oraz
            dla klas dziedziczących. Private sprawiłby, że konstruktor nie byłby
            dostępny dla klas w tym samym pakiecie lub dla klas dziedziczących
         */
    }
}
