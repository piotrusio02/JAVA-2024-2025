import java.util.Arrays;

public class Athlete implements Cloneable{
    String name;
    int[] lapTimes;

    public Athlete(String name, int[] lapTimes) {
        this.name = name;
        this.lapTimes = lapTimes;
    }

    @Override
    protected Athlete clone() throws CloneNotSupportedException {
        return (Athlete) super.clone();
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", lapTimes=" + Arrays.toString(lapTimes) +
                '}';
    }
}
