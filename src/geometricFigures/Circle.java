package geometricFigures;

public class Circle extends Shape{
    @Override
    public String render() {
        return "Circle";
    }

    @Override
    public Colors getColor() {
        return Colors.YELLOW;
    }
}
