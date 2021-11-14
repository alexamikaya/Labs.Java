package Seven.Figure;

public class Cylindr extends SolidofRevolution {
    protected double height;

    public double getHeight() {
        return height;
    }

    public Cylindr(double volume, double radius, double height) {
        super(volume, radius);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return height*Math.PI*Math.pow(radius,2); //высчитываем объем цилиндра
    }
}
