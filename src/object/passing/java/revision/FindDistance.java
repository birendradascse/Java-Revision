package object.passing.java.revision;

public class FindDistance {
    public static void main(String[] args) {

        Point p1 = new Point(10, 40);
        Point p2 = new Point(60, 80);

        System.out.println("Point x :" + p1);
        System.out.println("Point y :" + p2);

        double distance = p1.distance(p2);

        System.out.println("Point x by value :" +p2);
        System.out.println("distance beteent two poin using obj passing :" +distance);

    }
}
