package Task3;

public class Ellipse extends Shape {
    private double semi_major_axis;
    private double semi_minor_axis;

    // constructor
    public Ellipse(String name, double semi_major_axis, double semi_minor_axis) {
        super(name);
        this.semi_major_axis = semi_major_axis;
        this.semi_minor_axis = semi_minor_axis;
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
    public void setSemiMajorAxis(double semi_major_axis) {
        this.semi_major_axis = semi_major_axis;
    }

    public void setSemiMinorAxis(double semi_minor_axis) {
        this.semi_minor_axis = semi_minor_axis;
    }

    public void setAxes(double semi_major_axis, double semi_minor_axis) {
        this.semi_major_axis = semi_major_axis;
        this.semi_minor_axis = semi_minor_axis;
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
