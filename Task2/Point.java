package Task2;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    // constructors
    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // getters
    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public float[] getXY() {
        return new float[] { this.x, this.y };
    }

    // setters
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // toString()
    @Override
    public String toString() {
        return "(" + String.format("%.2f", this.x) + "," + String.format("%.2f", this.y) + ")";
    }
}