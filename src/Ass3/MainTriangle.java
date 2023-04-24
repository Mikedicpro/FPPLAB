package Ass3;
import java.util.Scanner;
public class MainTriangle {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter C for Circle\nEnter R for Rectangle\nEnter T for Triangle");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("R")) {
                System.out.println("Enter the width of the Rectangle:");
                double width = scanner.nextDouble();
                System.out.println("Enter the length of the Rectangle:");
                double length = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(width, length);
                System.out.printf("The area of Rectangle is: %.2f\n", rectangle.computeArea());
            } else if (choice.equalsIgnoreCase("T")) {
                System.out.println("Enter the base of the Triangle:");
                double base = scanner.nextDouble();
                System.out.println("Enter the height of the Triangle:");
                double height = scanner.nextDouble();
                Triangle triangle = new Triangle(base, height);
                System.out.printf("The area of Triangle is: %.2f\n", triangle.computeArea());
            } else if (choice.equalsIgnoreCase("C")) {
                System.out.println("Enter the radius of the Circle:");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                System.out.printf("The area of Circle is: %.2f\n", circle.computeArea());
            } else {
                System.out.println("Invalid Choice!");
            }
        }
    }

