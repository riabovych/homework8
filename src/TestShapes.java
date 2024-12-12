public class TestShapes {
    public static void main(String[] args) {
        Square square = new Square();
        Circle circle = new Circle();
        Quad quad = new Quad();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();

        ShapePrinter printer = new ShapePrinter();
        printer.printShape(square);
        printer.printShape(circle);
        printer.printShape(quad);
        printer.printShape(triangle);
        printer.printShape(rectangle);
    }
}
