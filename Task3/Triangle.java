package Task3;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    // constructor
    public Triangle(String name, double side1, double side2, double side3) {
        super(name);
        if (!this.is_valid_triangle(side1, side2, side3)) {
            throw new IllegalArgumentException("Sides must be positive and satisfy the triangle inequality.");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // private helper method to check if the sides comply with the triangle inequality theorem
    private boolean is_valid_triangle(double a, double b, double c) {
        return (a > 0) && (b > 0) && (c > 0) && (a + b > c) && (b + c > a) && (c + a > b);
    }

    // getters
    public double getSide1() {
        return this.side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public double getSide3() {
        return this.side3;
    }

    public double[] getSides() {
        return new double[] { this.side1, this.side2, this.side3 };
    }

    // setters
    public boolean setSide1(double side1) {
        if (!this.is_valid_triangle(side1, this.side2, this.side3)) {
            return false;
        }
        this.side1 = side1;
        return true;
    }

    public boolean setSide2(double side2) {
        if (!this.is_valid_triangle(this.side1, side2, this.side3)) {
            return false;
        }
        this.side2 = side2;
        return true;
    }

    public boolean setSide3(double side3) {
        if (!this.is_valid_triangle(this.side1, this.side2, side3)) {
            return false;
        }
        this.side3 = side3;
        return true;
    }

    public boolean setSides(double side1, double side2, double side3) {
        if (!this.is_valid_triangle(side1, side2, side3)) {
            return false;
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        return true;
    }

    // method to compute shape perimeter
    @Override
    public double getPerimeter() {
        return (this.side1 + this.side2 + this.side3);
    }

    // method to compute shape area
    @Override
    public double getArea() {
        double s = this.getPerimeter() / 2;
        return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
    }

    // toString()
    @Override
    public String toString() {
        return ("Triangle " + super.toString() +
        ", Side 1: " + String.format("%.2f", this.side1) +
        ", Side 2: " + String.format("%.2f", this.side2) +
        ", Side 3: " + String.format("%.2f", this.side3)
        );
    }
}
