import Task3.Shape;
import Task3.Ellipse;
import Task3.Circle;
import Task3.Triangle;
import Task3.EquilateralTriangle;

public class Task3Demo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
            new Circle("A", 5),
            new Circle("B", 1),
            new Ellipse("A", 8, 4),
            new Ellipse("B", 2, 4),
            new Triangle("A", 3, 4, 5),
            new Triangle("B", 8, 2, 7),
            new EquilateralTriangle("A", 6),
            new EquilateralTriangle("B", 1)
        };

        // loop through the array and print each shape's details
        for (Shape shape : shapes) {
            System.out.println("\n--> " + shape.toString());
            System.out.println("    Perimeter: " + String.format("%.2f", shape.getPerimeter()) 
                                + ", Area: " + String.format("%.2f", shape.getArea()));
        }

        // test validation
        System.out.println("\n=== Testing validation in constructors ===");
        System.out.println("\nCircle C: radius = -1");
        try {
            Circle c = new Circle("C", -1);
        } catch (IllegalArgumentException e) {
            System.out.println("* Error: " + e.getMessage());
        }
        System.out.println("\nEllipse D: semi-major axis = 2, semi-minor axis = 0");
        try {
            Ellipse d = new Ellipse("D", 2, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("* Error: " + e.getMessage());
        }
        System.out.println("\nTriangle E: side1 = 1, side2 = 2, side3 = 4");
        try {
            Triangle e = new Triangle("E", 1, 2, 4);
        } catch (IllegalArgumentException e) {
            System.out.println("* Error: " + e.getMessage());
        }
        System.out.println("\nEquilateralTriangle F: side = 0");
        try {
            EquilateralTriangle f = new EquilateralTriangle("F", 0);
        } catch (IllegalArgumentException e) {
            System.out.println("* Error: " + e.getMessage());
        }

        System.out.println("\n=== Testing validation in setters ===\n");
        Circle my_circle = new Circle("X", 5);
        System.out.println("--> " + my_circle);
        System.out.println();
        System.out.println("Setting radius to 10: " + (my_circle.setRadius(10) ? "Success" : "Failed"));
        System.out.println(my_circle);
        System.out.println();
        System.out.println("Setting radius to -5: " + (my_circle.setRadius(-5) ? "Success" : "Failed"));
        System.out.println(my_circle);
        System.out.println();
        Triangle my_triangle = new Triangle("Y", 3, 4, 5);
        System.out.println("--> " + my_triangle);
        System.out.println();
        System.out.println("Setting side1 to 6: " + (my_triangle.setSide1(6) ? "Success" : "Failed"));
        System.out.println(my_triangle);
        System.out.println();
        System.out.println("Setting side1 to 0: " + (my_triangle.setSide1(0) ? "Success" : "Failed"));
        System.out.println(my_triangle);
        System.out.println();
        System.out.println("Setting side2 to 1: " + (my_triangle.setSide2(1) ? "Success" : "Failed"));
        System.out.println(my_triangle);
    }
}
