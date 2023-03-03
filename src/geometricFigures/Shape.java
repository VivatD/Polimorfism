package geometricFigures;

public class Shape {

    public String render(){
        return "Shape";
    }
    public Colors getColor(){
        return Colors.BLACK;
    }

    public void print(){
        System.out.println("Form -> "+render()+ "\nColor -> "+ getColor()+"\n");
    }
}
