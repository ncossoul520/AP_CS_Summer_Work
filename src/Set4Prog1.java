public class Set4Prog1 {
    public static void run() {

        Sphere s1 = new Sphere(10);
        Sphere s2 = new Sphere(7);

        System.out.println( s1 );
        System.out.println( "Radius of s1: " + s1.getRadius() );
        System.out.println( "Volume of s1: " + s1.volume() );


        System.out.println( "s1 larger than s2: " + s1.isLagerThan( s2 ));
        s2.setRadius(15);
        System.out.println( "s1 larger than s2: " + s1.isLagerThan( s2 ));

        s1.setRadius(3);
        System.out.println( "Radius of s1: " + s1.getRadius() );
        System.out.println( "Volume of s1: " + s1.volume() );


    }
}
