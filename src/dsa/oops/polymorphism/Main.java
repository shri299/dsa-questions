package dsa.oops.polymorphism;

public class Main {

    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Shapes shapes1 = new Circle();
//        shapes.area();
//        circle.area();
//        square.area();
        shapes1.area();
    }
}
