package Task3;

public class Circle extends Ellipse {

    // constructor
    public Circle(String name, double radius) {
        // we call the superclass constructor with the same radius for both axes
        // but we need to validate the radius first and throw an exception if it's not positive
        super(name, validate_radius(radius), validate_radius(radius));
    }
    
    // helper method to validate the radius
    private static double validate_radius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }
        return radius;
    }

    // getter
    public double getRadius() {
        return super.getSemiMajorAxis();
    }

    // setter
    public boolean setRadius(double radius) {
        if (radius <= 0) {
            return false;
        }
        super.setAxes(radius, radius);
        return true;
    }

    // overriding other setters to maintain the circle property
    @Override
    public boolean setSemiMajorAxis(double semi_major_axis) {
        return this.setRadius(semi_major_axis);
    }

    @Override
    public boolean setSemiMinorAxis(double semi_minor_axis) {
        return this.setRadius(semi_minor_axis);
    }

    @Override
    public boolean setAxes(double semi_major_axis, double semi_minor_axis) {
        if (semi_major_axis != semi_minor_axis) {
            return false;
        }
        return this.setRadius(semi_major_axis);
    }

    // Override toString()
    @Override
    public String toString() {
        return ("Circle " + super.getName() +", Radius: " + String.format("%.2f", this.getRadius()));
    }
}
