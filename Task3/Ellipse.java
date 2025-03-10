package Task3;

public class Ellipse extends Shape {
    private double semi_major_axis;
    private double semi_minor_axis;

    // constructor
    public Ellipse(String name, double semi_major_axis, double semi_minor_axis) {
        super(name);
        if (!this.is_valid_ellipse(semi_major_axis, semi_minor_axis)) {
            throw new IllegalArgumentException("Semi-major/semi-minor axes must be positive.");
        }
        this.semi_major_axis = semi_major_axis;
        this.semi_minor_axis = semi_minor_axis;
    }

    private boolean is_valid_ellipse(double a, double b) {
        return (a > 0) && (b > 0);
    }

    // getters
    public double getSemiMajorAxis() {
        return this.semi_major_axis;
    }

    public double getSemiMinorAxis() {
        return this.semi_minor_axis;
    }

    public double[] getAxes() {
        return new double[] { this.semi_major_axis, this.semi_minor_axis };
    }

    // setters
    public boolean setSemiMajorAxis(double semi_major_axis) {
        if (!this.is_valid_ellipse(semi_major_axis, this.semi_minor_axis)) {
            return false;
        }
        this.semi_major_axis = semi_major_axis;
        return true;
    }

    public boolean setSemiMinorAxis(double semi_minor_axis) {
        if (!this.is_valid_ellipse(this.semi_major_axis, semi_minor_axis)) {
            return false;
        }
        this.semi_minor_axis = semi_minor_axis;
        return true;
    }

    public boolean setAxes(double semi_major_axis, double semi_minor_axis) {
        if (!this.is_valid_ellipse(semi_major_axis, semi_minor_axis)) {
            return false;
        }
        this.semi_major_axis = semi_major_axis;
        this.semi_minor_axis = semi_minor_axis;
        return true;
    }

    // methods to compute shape perimeter and area
    @Override
    public double getPerimeter() {
        return (4 * (Math.PI * this.semi_major_axis * this.semi_minor_axis + Math.pow(this.semi_major_axis - this.semi_minor_axis, 2))
                / (this.semi_major_axis + this.semi_minor_axis));
    }

    @Override
    public double getArea() {
        return Math.PI * this.semi_major_axis * this.semi_minor_axis;
    }

    // Override toString()
    @Override
    public String toString() {
        return ("Ellipse " + super.toString() + 
        ", Semi-Major Axis: " + String.format("%.2f", this.semi_major_axis) +
        ", Semi-Minor Axis: " + String.format("%.2f", this.semi_minor_axis)
        );
    }
}
