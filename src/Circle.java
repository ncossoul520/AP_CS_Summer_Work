public class Circle {
    private double x, y, radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public boolean containsOrigin() {
        return Math.sqrt(x*x + y*y) <= this.radius;
    }

    public boolean containsPoint(double x, double y) {
        double delta_x = x - this.x;
        double delta_y = y - this.y;
        return Math.sqrt(delta_x*delta_x + delta_y*delta_y) <= this.radius;
    }

    public boolean isLargerThan(Circle other) {
        return this.radius > other.getRadius();
    }

    public String toString() {
        return "x = " + this.x + "\ty = " + this.y + "\tradius = " + this.radius;
    }
}
