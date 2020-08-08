import java.util.ArrayList;

public class Set7Prog5 {
    public static void run() {
        ArrayList<Circle> circles = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            circles.add( new Circle( randomNeg200to200(), randomNeg200to200(), random1to100()) );
        }

        // Circle tests
//        Circle test_circle = new Circle(0, 0, 1);
//        System.out.println( test_circle.getRadius() );
//        System.out.println( test_circle.getArea() );
//        System.out.println( test_circle.getCircumference());
//        System.out.println( test_circle.containsPoint(0.7, 0.7));
//        Circle test_circle2 = new Circle(0, 0, 1.1);
//        System.out.println( test_circle.isLargerThan(test_circle2) );
//        System.out.println( test_circle2.isLargerThan(test_circle) );


        for (Circle circle : circles) {
            if (circle.containsOrigin()) {
                System.out.println(circle);
            }
        }
    }

    private static double random1to100() {
        return Math.random()*99+1;
    }

    private static double randomNeg200to200() {
        return Math.random()*400-200;
    }
}
