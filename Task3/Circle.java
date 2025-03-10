package Task3;

public class Circle extends Shape {
    private double radius;

    // constructor
    public Circle(String name, double radius) {
        super(name);
        if (!this.is_valid_circle(radius)) {
            throw new IllegalArgumentException("Radius must be positive.");
        }
        this.radius = radius;
    }

    // helper method to check if the radius is positive
    private boolean is_valid_circle(double radius) {
        return radius > 0;
    }

    // getter
    public double getRadius() {
        return this.radius;
    }

    // setter
    public boolean setRadius(double radius) {
        if (!this.is_valid_circle(radius)) {
            return false;
        }
        this.radius = radius;
        return true;
    }

    // methods to compute shape perimeter and area
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    // Override toString()
    @Override
    public String toString() {
        return ("Circle " + super.toString() +
        ", Radius: " + String.format("%.2f", this.radius));
    }
}
