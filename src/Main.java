import geometricFigures.Circle;
import geometricFigures.Polygon;
import geometricFigures.Shape;
import geometricFigures.Square;

public class Main {

    public static void main(String[] args) {

        Square square = new Square();
        square.print();
        Circle circle = new Circle();
        circle.print();
        Polygon polygon = new Polygon();
        polygon.print();

        Shape s = new Square();
        s.print();
        Shape c = new Circle();
        c.print();
        Shape p = new Polygon();
        p.print();
    }
}
