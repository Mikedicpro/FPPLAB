package ass5;
/*
* Problem : 1
Look at the UML & design the four different classes such as Shape.java, Rectengle.java,
Circle.java and Square.java as per the relationship of the given diagram.
Perform the following tasks
a. The return value of calcualteArea() & calculatePerimeter() is double.
b. Don’t provide any getter or setters, make all the fields as either default or protected.
c. In the Shape class just return 0.0 for the calcualteArea() & calculatePerimeter().
d. Square class has no attribute. Assign the passed side value to height and width attribute of
its super class Rectangle. Because four sides are same in the Square. No need to
implement calcualteArea() & calculatePerimeter() inside Square class. You have to make
use Rectangle class calcualteArea() & calculatePerimeter(). Because you pass height and
width as same value.
e. Create a main class to test the application to perform the below tasks
a. Create an array of Shape[] to hold at-least five objects for its subtypes.
b. Create a Static method to print the total area of all the Shape objects and print the
total perimeter of all the Shape objects.
public static void printTotal(Shape[] shapes)
 { // Implement your code
 }
Area of Rectangle = width * height
Area of Circle = π * r * r
Area of Square = side * side
Perimeter of Rectangle = 2 * width + 2 * height
Perimeter of Circle = 2 * π * r
Perimeter of Square = 4 * side

* */
public class MainTest {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[5];
        shapes[0]=new Rectangle("Green",2.0,4.0);
        shapes[1]=new Circle("Yellow",3.0);
        shapes[2]=new Square("Black",5.0);
        shapes[3]=new Rectangle("Red",3.0,6.0);
        shapes[4]=new Circle("Red",4.0);


         printTotal(shapes);

    }
    public static void printTotal(Shape[] shapes){
        double totalArea=0.0;
        double totalPerimeter=0.0;

        for(Shape shape:shapes){
            totalArea+=shape.calculateArea();
            totalPerimeter+=shape.calculatePerimeter();
        }

        System.out.println("Total area of all shape objects is = "+totalArea);
        System.out.println("Total perimeter of all the shape objects = "+ totalPerimeter);

    }
}
