import javax.swing.*;

public class Set1Prog1 {

    public void run() {
        double radius = Double.parseDouble(JOptionPane.showInputDialog("What's your radius? "));
        System.out.println("circumference: " + circumference(radius) );

        System.out.println("area: " + area(radius));
    }

    private double area(double radius) {
        return Math.PI * radius * radius;
    }

    private double circumference(double radius) {
        return 2 * Math.PI * radius;
    }
}
