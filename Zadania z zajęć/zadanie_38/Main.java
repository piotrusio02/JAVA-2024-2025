/* Stwórz rekord Student, który reprezentuje imię, nazwisko
i listę ocen ucznia. Wprowadź metodę averageGrades(), która
oblicza średnią ocen ucznia. Stwórz przypadek testowy.
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> lista = new ArrayList<Double>();
        lista.add(5.0);
        lista.add(2.5);
        lista.add(4.5);

        Student student = new Student("Janek", "Makelewicz",lista);
        System.out.println(student.toString());
        System.out.println(student.averageGrades());
    }
}
