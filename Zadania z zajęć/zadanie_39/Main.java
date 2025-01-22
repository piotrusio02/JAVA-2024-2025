/* Stwórz rekord BankAccount, który zawiera numer konta oraz saldo. 
Dodaj konstruktor, który pozwala na tworzenie konta tylko z numerem, 
przy czym domyślne saldo wynosi 0. Stwórz przypadek testowy.
 */

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("3334444222", 5034.50);
        BankAccount account2 = new BankAccount("34343434343434");

        System.out.println(account1.toString());
        System.out.println(account2.toString());
    }
}
