package ass5;

public abstract class Shape

{
    protected double area;
    protected double perimeter;
    String color;
    public Shape(String color){
        this.color=color;
    }

    abstract public double calculateArea();


   abstract public double calculatePerimeter();


}
