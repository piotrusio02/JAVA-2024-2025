public class SklepMonopolowy {

    public void sprzedajCos(){
        checkAge(17);
    }

    public void checkAge(int age){
        if(age<18){
            throw new IllegalArgumentException("Niepełnoletni klient");
        }
    }
}
