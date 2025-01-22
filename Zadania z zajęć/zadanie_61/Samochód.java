/* Stwórz interfejs Silnik z metodami uruchom() i zatrzymaj().
Utwórz klasę BenzynowySilnik, która implementuje Silnik i symuluje działanie silnika na benzynę.
Utwórz klasę Samochód, która posiada prywatne pole typu Silnik. W konstruktorze przyjmij Silnik 
jako argument. Dodaj metody start() i stop(), które będą delegować odpowiednio zadanie uruchomienia 
i zatrzymania silnika do obiektu klasy Silnik.
 */

public class Samochód {
    private Silnik silnik;

    public Samochód(Silnik silnik) {
        this.silnik = silnik;
    }

    public void start(){
        silnik.uruchom();
    }

    public void stop(){
        silnik.zatrzymaj();
    }

    public static void main(String[] args) {
        BenzynowySilnik bs = new BenzynowySilnik();
        Samochód samochód = new Samochód(bs);
        samochód.start();
        samochód.stop();

    }
}
