import javax.swing.*;

public class Set2Prog7 {
    public static void runA() {
        int num;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        } while ( num > 15 || num < 10);
        System.out.println("Your number was " + num);
    }

    public static void runB() {
        int num;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        } while ( num > 20 || num < 10 || num % 2 == 0 );
        System.out.println("Your number was " + num);
    }
}
