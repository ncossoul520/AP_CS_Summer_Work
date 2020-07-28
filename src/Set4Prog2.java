import java.util.ArrayList;

public class Set4Prog2 {
    public static void runA() {
        Point p = new Point(3, 4);
        System.out.println("X equals: " + p.getX());
        System.out.println("Y equals: " + p.getY());

        p.setX(2.5);
        p.setY(3.5);
        System.out.println("X equals: " + p.getX());
        System.out.println("Y equals: " + p.getY());

        Point other = new Point(3, 4);
        p.setX(0);
        p.setY(0);
        System.out.println("Distance = " + p.distanceTo(other));

        System.out.println("p is right from other: " + p.isRightOf(other));
        p.setX(3.1);
        System.out.println("p is right from other: " + p.isRightOf(other));

        p.setX(0);
        System.out.println( "p and other are closer than 4.9: " + p.areClose(other, 4.9) );
        System.out.println( "p and other are closer than 5.0: " + p.areClose(other, 5) );
        System.out.println( "p and other are closer than 5.1: " + p.areClose(other, 5.1) );
    }

    public static void runBC() {
        ArrayList<Point> pointList = new ArrayList<Point>();
        for (int i = 0; i < 100; i++) {
            Point p = new Point( Math.random()*200 - 100, Math.random()*200 - 100);
            pointList.add( p );
//            System.out.println(i + ": " + p);
        }

        Point target = pointList.get( pointList.size() - 1 );
        for (int i = 0; i < 99; i++) {
            if ( target.distanceTo( pointList.get(i) ) <= 50 ) {
                System.out.println(pointList.get(i) + " (distance = " + target.distanceTo( pointList.get(i) ) + ")");
            }
        }
    }
}
