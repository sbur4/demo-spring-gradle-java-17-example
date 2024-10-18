package j17.sealed_classes_preview;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("Shape");
        Shape circle = new Circle(30.0);
        Shape rectangle = new Rectangle(10d, 10d);
        Shape square = new Square(20d);

        System.out.println(shape.getType());
        System.out.println(circle.getType());
        System.out.println(rectangle.getType());
        System.out.println(square.getType());

        Circle circle2 = new Circle(5d);
        System.out.println(circle2.getType());
        System.out.println(circle2.getRadius());
    }
}
