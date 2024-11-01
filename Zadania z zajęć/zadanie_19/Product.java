/* Stwórz klasę Product, która zawiera pole statyczne numberOfProducts 
   oraz pole statyczne MAX_PRODUCTS. Pole numberOfProducts będzie służyć 
   do zliczania ilości utworzonych produktów, a MAX_PRODUCTS do ograniczenia 
   ich liczby. Oznacz tylko jedno z tych pól słowem kluczowym final i zastanów 
   się nad konsekwencjami tego wyboru. */


public class Product {
    public static Integer numberOfProducts = 0;
    public static final Integer MAX_PRODUCTS = 100;
    /* final znajdzie się przy drugim polu ponieważ wtedy te pole będzie nie modyfikowalne.
       Maksymalna liczba produktów powinna być nieruszalna.  */
}
