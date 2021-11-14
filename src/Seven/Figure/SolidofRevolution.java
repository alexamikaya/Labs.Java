package Seven.Figure;

public class SolidofRevolution extends Shape {
    protected double radius;

    public double getRadius() {
        return radius;
    }

    public SolidofRevolution(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }
}
