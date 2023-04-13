package ass5;

public class Circle extends Shape {
    protected double radius;
    public Circle(String color,double radius){
        super(color);
        this.radius=radius;
    }
    @Override
    public double calculateArea(){
        area=Math.PI*radius*radius;
        return area;
    }
    @Override
    public double calculatePerimeter(){
        perimeter=2*Math.PI*radius;
        return perimeter;
    }
}
