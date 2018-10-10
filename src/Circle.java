public class Circle extends Point{

    private double radius;
    private String color;
    private double arcLength;

    public Circle() {
        this(1.0, "red", 0.0, 0.0);
    }

    public Circle(double radius) {
        this(radius, "red", 0.0, 0.0);
    }

    public Circle(double radius, String color) {
        this(radius, color, 0.0, 0.0);
    }

    public Circle(double radius, String color, double x, double y) {
        this.radius = radius;
        this.color = color;
        this.arcLength = 2 * radius * Math.PI;
        super.setCoordenadas(x, y);
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.arcLength = 2 * radius * Math.PI;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArcLength() {
        return arcLength;
    }

    public void setX(double x) {
        super.setCoordenadas(x, super.getY());
    }

    public void setY(double y) {
        super.setCoordenadas(super.getX(), y);
    }

    public String printCoordenadas() {
        return "Coordenadas do centro: X = " + super.getX() + " Y = " + super.getY();
    }

    @Override
    public String toString() {
        return "Circulo: raio = " + radius + " cor = " + color + ".\nCoordenadas do centro: X = " + super.getX() + " Y = " + super.getY();
    }
}
