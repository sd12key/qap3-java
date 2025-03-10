package Task3;

public abstract class Shape {
    private String name;

    // constructor
    public Shape(String name) {
        this.name = name;
    }

    // getter
    public String getName() {
        return this.name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    // methods to compute shape perimeter and area
    // abstract methods to be implemented by subclasses
    public abstract double getPerimeter();
    public abstract double getArea();
    
    // toString()
    @Override
    public String toString() {
        return this.name;
    }
}
