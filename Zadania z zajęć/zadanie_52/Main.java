/* Napisz program, który definiuje metodę checkAge(int age). Metoda 
ta powinna rzucić wyjątek IllegalArgumentException z odpowiednim 
komunikatem, jeśli podany wiek jest mniejszy niż 18. W głównej metodzie 
programu (main) wywołaj checkAge z różnymi wartościami i obsłuż wyjątek, 
wyświetlając stosowny komunikat dla użytkownika.
 */

public class Main {
    public static void main(String[] args) {
        SklepMonopolowy sklep = new SklepMonopolowy();
        try{
            sklep.sprzedajCos();
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }

    }

}
