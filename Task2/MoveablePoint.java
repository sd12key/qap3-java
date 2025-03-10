package Task2;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    // constructors
    public MoveablePoint() {
        super();
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // getters
    public float getXSpeed() {
        return this.xSpeed;
    }

    public float getYSpeed() {
        return this.ySpeed;
    }

    public float[] getSpeed() {
        return new float[] { this.xSpeed, this.ySpeed };
    }

    // setters
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // move() method
    public MoveablePoint move() {
        super.setX(super.getX() + this.xSpeed);
        super.setY(super.getY() + this.ySpeed);
        return this;
    }

    // toString()
    @Override
    public String toString() {
        return super.toString() + ", speed=(" + String.format("%.2f", this.xSpeed) + "," + String.format("%.2f", this.ySpeed) + ")";
    }
}