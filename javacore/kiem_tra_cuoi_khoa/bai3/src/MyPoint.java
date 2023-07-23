import java.lang.management.MemoryType;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint() {

    }

    public MyPoint(MyPoint p) {
        this.x = p.getX();
        this.y = p.getY();
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(MyPoint secondPoint) {
        return Math.sqrt(Math.pow((this.x - secondPoint.getX()), 2) + Math.pow((this.y - secondPoint.getY()), 2));
    }

    public double distance(MyPoint p1, MyPoint p2) {
        return Math.sqrt(Math.pow((p1.getX() - p2.getX()), 2) + Math.pow((p1.getY() - p2.getY()), 2));
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
