import java.util.ArrayList;

public record Student(String imie, String nazwisko, ArrayList<Double> lista) {
    public Double averageGrades(){
        Double temp = 0.0;
        for(Double oceny : lista){
            temp+= oceny;
        }
        return temp / lista.size();
    }
}
