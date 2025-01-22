public class BenzynowySilnik implements Silnik{

    @Override
    public void uruchom() {
        System.out.println("Uruchomiono silnik");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("zatrzymano silnik");
    }
}
