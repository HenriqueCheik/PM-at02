public class TestCircle {
    public static void main(String[] args) {
        Circle c1;

        c1 = new Circle();

        System.out.println(c1);
//        System.out.println("O circulo tem raio de " + c1.getRadius() + " e area de " + c1.getArea());

        Circle c2 = new Circle(2.0, "azul", 2, 3);

//        System.out.println(c2.toString());
        System.out.println(c2);

//        System.out.println("O circulo tem raio de " + c2.getRadius() + " e area de " + c2.getArea());

//        Circle c3 = new Circle(3.0, "azul");
//
//        System.out.println("O circulo 3 tem raio de " + c3.getRadius() + ", area de " + c3.getArea() + " e cor " + c3.getColor());

    }
}
