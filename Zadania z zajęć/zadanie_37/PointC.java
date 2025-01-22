public class PointC {
    int x;
    int y;

    public PointC(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public PointR toPointR(){
        return new PointR(x,y);
    }

    @Override
    public String toString() {
        return "PointC{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
