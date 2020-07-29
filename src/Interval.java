public class Interval {
    private double lower;
    private double upper;

    public Interval(double lower, double upper) {
        this.lower = lower;
        this.upper = upper;
    }

    public double getLower() {
        return this.lower;
    }

    public void setLower(double lower) {
        this.lower = lower;
    }

    public double getUpper() {
        return this.upper;
    }

    public void setUpper(double upper) {
        this.upper = upper;
    }

    public String toString() {
        return "[" + this.lower + ", " + this.upper + "]";
    }

    public boolean isInside(double d) {
        return d >= this.lower && d <= this.upper;
    }
}
