import java.util.ArrayList;

public class Set6Prog1 {
    public static void run1() {
        // Create an ArrayList<Point> representing a path.
        // Add 5 points that represents a square (the 5th point is the same as the 1st point
        // Then calculate the length and display it to verify that it worked.
        ArrayList<Point> path = new ArrayList<>();
        path.add( new Point(0, 0) );
        path.add( new Point(5, 0) );
        path.add( new Point(5, 5) );
        path.add( new Point(0, 5) );
        path.add( new Point(0, 0) );
        System.out.println("Length = " + findPathLength( path ));
    }

    public static double findPathLength(ArrayList<Point> path) {
        double length = 0;
        for (int i = 0; i < path.size()-1; i++) {
            Point p1 =  path.get(i);
            Point p2 =  path.get(i+1);
            length += p1.distanceTo( p2 );
        }
        return length;
    }


    public static void run2() {
        Path path = new Path();
        path.addPoint(0, 0);
        path.addPoint(0, 10);
        path.addPoint(10, 10);
        path.addPoint(10, 0);
        path.addPoint(0, 0);
        System.out.println("Length of path is: " + path.getLength());
    }
}
