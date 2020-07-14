import javax.swing.*;

public class Set1Prog3 {

    public static void run() {
        double temp, wind;
        do {
            temp = Double.parseDouble(JOptionPane.showInputDialog("What's the temperature? (-50 <= t <= 50)"));
        } while (temp < -50 || temp > 50);

        do {
            wind = Double.parseDouble( JOptionPane.showInputDialog("What's the wind speed? (3 <= s <= 120") );
        } while (wind < 3 || wind > 120);

        System.out.println("The wind chill corresponding to " + temp + "F and " + wind + "mph is: " +
                windChill(temp, wind) + "F");
    }

    /***
     * Returns wind chill (effective temperature in F) given a temp (F) and
     * windspeed (mph) in the ranges -50 < temp < 50 and 3 < windSpeed < 120
     *
     * @param temp the temperature in F in the range (-50, 50)
   	 * @param windSpeed the wind speed in mph in the range (3, 120)
   	 * @return the effective temperature (wind chill) in F
   	 */
    private static double windChill(double temp, double windSpeed) {
        return 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
    }

}
