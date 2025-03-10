import Task4.Circle;
import Task4.Ellipse;
import Task4.EquilateralTriangle;
import Task4.Triangle;
import Task4.Shape;

public class Task4Demo {
    public static void main(String[] args) {
        // create an array of scaling factors
        double[] scales = {0.3, 1.2, 3.0, 7.0, -2};

        // create objects
        Shape[] shapes = {
            new Circle("A", 5),
            new Ellipse("B", 8, 4),
            new EquilateralTriangle("C", 6),
            new Triangle("D", 3, 4, 5)
        };

        // loop through
        for (double scale : scales) {
            System.out.println("\n==== Scaling by factor: " + String.format("%.2f", scale) + " ====");
            for (Shape shape : shapes) {
                // original object
                System.out.println("Before scaling: " + shape);
                // try to scale the object
                System.out.println("--> Scaling was " + (shape.scale(scale) ? "successful" : "unsuccessful"));
                // print scaled object
                System.out.println("After scaling:  " + shape);
                System.out.println("-----------------------------");
            }
        }
    }
}
