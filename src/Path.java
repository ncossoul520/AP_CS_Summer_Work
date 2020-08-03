import java.util.ArrayList;

public class Path {
    private ArrayList<Point> points;

    public Path() {
        points = new ArrayList<>();
    }

    public void addPoint(int x, int y) {
        points.add( new Point(x, y) );
    }

    public double getLength() {
        double length = 0;
        for (int i = 0; i < points.size()-1; i++) {
            Point p1 =  points.get(i);
            Point p2 =  points.get(i+1);
            length += p1.distanceTo( p2 );
        }
        return length;
    }

    public Point getPoint(int i) {
        if (i < 0 || i >= points.size() ) {
            return null;
        }
        return points.get(i);
    }
}
