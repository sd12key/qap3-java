package Task3;

public class EquilateralTriangle extends Triangle {

    // constructor
    public EquilateralTriangle(String name, double side) {
        super(name, validate_side(side), validate_side(side), validate_side(side));
    }

    // helper method to validate the side
    private static double validate_side(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Side must be positive.");
        }
        return side;
    }

    // getter
    public double getSide() {
        return super.getSide1();
    }

    // setter
    public boolean setSide(double side) {
        if (side <= 0) {
            return false;
        }
        return super.setSides(side, side, side);
    }

    // overriding other setters to maintain the equilateral property
    @Override
    public boolean setSide1(double side1) {
        return this.setSide(side1);
    }

    @Override
    public boolean setSide2(double side2) {
        return this.setSide(side2);
    }

    @Override
    public boolean setSide3(double side3) {
        return this.setSide(side3);
    }

    @Override
    public boolean setSides(double side1, double side2, double side3) {
        if (side1 != side2 || side2 != side3 || side1 != side3) {
            return false;
        }
        return super.setSides(side1, side1, side1);
    }

    @Override
    public String toString() {
        return "Equilateral triangle " + super.getName()+ ", Side: " + String.format("%.2f", this.getSide());
    }
}
