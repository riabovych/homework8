public class TestShapes {
    public static void main(String[] args) {
        Square square = new Square();
        Circle circle = new Circle();
        Quad quad = new Quad();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();

        System.out.println("Figure is: " + square.getName());
        System.out.println("Figure is: " + circle.getName());
        System.out.println("Figure is: " + quad.getName());
        System.out.println("Figure is: " + triangle.getName());
        System.out.println("Figure is: " + rectangle.getName());
    }
}
