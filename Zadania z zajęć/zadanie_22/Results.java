import java.util.Arrays;
import java.util.Objects;

public class Results {
    private String firstName;
    private String lastName;
    private int[] results;

    Results(String firstName, String lastName, int size){
        this.firstName = firstName;
        this.lastName = lastName;
        this.results = new int[size];
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int[] getResults() {
        return results;
    }

    public void setResults(int[] results) {
        this.results = results;
    }

    public void addResult(int index,int result){
        if(index >= 0 && index < results.length){
            results[index] = result;
        }
        else {
            System.out.println("błąd");
        }
    }


    public double averageResult(){
        double temp = 0.0;
        for (int i = 0; i < results.length; i++) {
            temp+= results[i];
        }
        return temp / results.length;
    }

    @Override
    public String toString() {
        return "Results for "+firstName+" "+lastName+": Average Score = "+this.averageResult()+",\n"+
                "Results: "+ Arrays.toString(results)+".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Results results1 = (Results) o;
        return Objects.equals(firstName, results1.firstName) && Objects.equals(lastName, results1.lastName) && Objects.deepEquals(results, results1.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, Arrays.hashCode(results));
    }
}
