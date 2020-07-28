public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanceTo(Point other) {
        return Math.sqrt( Math.pow( (other.x - this.x), 2) + Math.pow( (other.y - this.y), 2) );
    }

    public boolean isRightOf(Point other) {
        return other.x < this.x;
    }

    public boolean areClose(Point other, double amt) {
        return this.distanceTo(other) <= amt;
    }

    public String toString() {
        return "x = " + this.x + " y = " + this.y;
    }
}
