public class Box<T,U> {
    T value1;
    U value2;

    public Box(T value1,U value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getValue1() {
        return value1;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public U getValue2() {
        return value2;
    }

    public void setValue2(U value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "Box{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
}
