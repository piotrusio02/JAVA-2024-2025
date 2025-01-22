/* Napisz klasę Teacher z trzema polami: name (String), subject (String) i 
experience (int). Zaimplementuj interfejs Cloneable i nadpisz metodę clone(), 
aby móc klonować obiekty tej klasy. W metodzie main() utwórz obiekt Teacher, 
sklonuj go, a następnie zmień doświadczenie (experience) oryginalnego nauczyciela. 
Wyświetl doświadczenie obu nauczycieli, aby zobaczyć, czy są niezależne.
 */

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Janek", "wf", 4);
        Teacher t2 = null;

        try{
            t2 = t1.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        System.out.println("t1: " + t1);
        System.out.println("t2: "+t2);
        t1.experience = 15;
        System.out.println("t1: "+t1);
    }
}
