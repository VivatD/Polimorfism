package geometricFigures;

public class Square extends Shape{
    @Override
    public String render() {
        return "Square";
    }

    @Override
    public Colors getColor() {
        return Colors.GREEN;
    }
}
