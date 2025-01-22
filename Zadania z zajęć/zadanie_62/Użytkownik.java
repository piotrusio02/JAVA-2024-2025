/* Stwórz interfejs Powiadomienie z metodą wyślij(String wiadomość).
Utwórz klasę Email, która implementuje Powiadomienie i symuluje wysyłanie wiadomości e-mail.
Utwórz klasę Użytkownik, która posiada prywatne pole typu Powiadomienie. W konstruktorze przyjmij
 Powiadomienie jako argument. Dodaj metodę powiadomOModernizacji(String informacja), która będzie delegować 
 zadanie wysyłania powiadomienia do obiektu klasy Powiadomienie.
 */


public class Użytkownik {
    private Powiadomienie powiadomienie;

    public Użytkownik(Powiadomienie powiadomienie) {
        this.powiadomienie = powiadomienie;
    }

    public void powiadomOModernizacji(String informacja){
        powiadomienie.wyślij(informacja);
    }

    public static void main(String[] args) {
        Email email = new Email();
        Użytkownik użytkownik = new Użytkownik(email);
        użytkownik.powiadomOModernizacji("informacja");
    }
}
