public class Point {
    private double x;
    private double y;

    public void setCoordenadas(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString(){
        return "Ponto: X = " + x + " Y = " + y;
    }
}
