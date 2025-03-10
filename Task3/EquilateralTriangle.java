package Task3;

public class EquilateralTriangle extends Triangle {

    // constructor
    public EquilateralTriangle(String name, double side) {
        super(name, side, side, side);
    }

    @Override
    public String toString() {
        return "Eqilateral " + super.toString();
    }
}