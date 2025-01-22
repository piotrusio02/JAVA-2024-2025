public record PointR(int x, int y) {
    public PointC toPointC(){
        return new PointC(x,y);
    }
}
