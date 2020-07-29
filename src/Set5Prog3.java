import javax.swing.*;
import java.util.ArrayList;

public class Set5Prog3 {
    public static void run() {
        ArrayList<Interval> intervals = new ArrayList<Interval>();
        for (int i = 0; i < 100; i++) {
            double a = Math.random()*500;
            double b = Math.random()*500;
            double lower = a < b ? a : b;
            double upper = a > b ? a : b;
            intervals.add( new Interval(lower, upper) );
        }
        // test
//        for (int i = 0; i < 10; i++) {
//            System.out.println( intervals.get(i) );
//        }

        double target = Double.parseDouble( JOptionPane.showInputDialog("Enter a value between 0 and 100") );

        for (int i = 0; i < intervals.size(); i++) {
            if (intervals.get(i).isInside(target) ) {
                System.out.println(intervals.get(i));
            }
        }
    }
}
