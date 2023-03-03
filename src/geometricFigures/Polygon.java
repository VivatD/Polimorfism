package geometricFigures;

public class Polygon extends Shape{
    @Override
    public String render() {
        return "Polygon";
    }

    @Override
    public Colors getColor() {
        return Colors.RED;
    }
}
