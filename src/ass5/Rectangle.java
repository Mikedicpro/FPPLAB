package ass5;

public class Rectangle extends Shape {
    protected double width;
    protected double height;

    public Rectangle(String color ,double width, double height) {
        super(color);
        this.height = height;
        this.width = width;

    }


    @Override
    public double calculateArea() {
        area = width * height;
        return area;

    }

        @Override
        public double calculatePerimeter () {
           // perimeter = 2 * (width * height);
            perimeter=2*width+2*height;
            return perimeter;
        }
    }
