/* Utwórz rekord Address, który zawiera street, houseNumber, postalCode i city. Następnie, 
  stwórz rekord Person, który oprócz podstawowych informacji o osobie (np. firstName, lastName) 
  zawiera również pole typu Address. Stwórz przypadek testowy. */

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Kwiatowa", 15, "06-323", "Jednorożec");

        System.out.println(address1);

        Person person1 = new Person("Janek", "Błach", address1);
        Address address2;
        Person person2 = new Person("Kuba", "Bruh", address2 = new Address("Kwiatowa", 15, "06-323", "Jednorożec"));
        System.out.println(person1);
        System.out.println(person2);
    }
}
