public class Email implements Powiadomienie{

    @Override
    public void wyślij(String wiadomość) {
        System.out.println("wysłano wiadomość email");
    }
}
