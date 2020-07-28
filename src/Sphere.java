public class Sphere {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double volume() {
        return 4/3.0 * Math.PI * this.radius * this.radius * this.radius;
    }

    public String toString() {
        return "Your circle has radius: " + this.radius;
    }

    public boolean isLagerThan( Sphere s2 ) {
        return this.radius > s2.getRadius();
    }

}
