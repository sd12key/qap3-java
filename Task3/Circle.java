package Task3;

public class Circle extends Shape {
    private double radius;

    // constructor
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    // getter
    public double getRadius() {
        return this.radius;
    }

    // setter
    public void setRadius(double radius) {
        this.radius = radius;
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
