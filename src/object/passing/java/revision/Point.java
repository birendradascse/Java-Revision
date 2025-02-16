package object.passing.java.revision;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
    }
    public double distance (Point p2)
    {
        double d = Math.sqrt(Math.pow((p2.x - this.x),2) + Math.pow((p2.y - this.y),2));
        p2.x = 30;
        return d;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
