import Task2.Point;
import Task2.MoveablePoint;

public class Task2Demo {
    public static void main(String[] args) {
        Point p1 = new Point(1.0f, 2.0f);
        System.out.println("Static Point: " + p1);
        MoveablePoint mp1 = new MoveablePoint(1.0f, 2.0f, 5.0f, 6.0f);
        System.out.println("Moveable Point: " + mp1);
        mp1.move();
        System.out.println("Moveable Point (move 1): " + mp1);
        mp1.move();
        System.out.println("Moveable Point (move 2): " + mp1);
    }
}
