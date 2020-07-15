import javax.swing.*;

public class Set2Prog1 {
    public static void run() {
        
        for (int i = 0; i < 5; i++) {
            int guess = Integer.parseInt( JOptionPane.showInputDialog("Guess a number: ") );
            int num1 = (int)(Math.random()*20 + 1);
            int num2 = (int)(Math.random()*20 + 1);
            int max = Math.max(Math.max(guess, num1),num2);
            int min = Math.min(Math.min(guess, num1), num2);
            int mid;
            if ( guess != min && guess != max) {
                mid = guess;
            } else if ( num1 != min && num1 != max) {
                mid = num1;
            } else {
                mid = num2;
            }

            if (guess == mid) {
                System.out.println( min + " " + mid + " " + max + " \t WINNER!" );
            } else {
                System.out.println( min + " " + mid + " " + max );
            }
        }
    }
}
