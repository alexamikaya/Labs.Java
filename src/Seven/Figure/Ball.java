package Seven.Figure;

public class Ball extends SolidofRevolution{
    public Ball(double volume, double radius) {
        super(volume, radius);
    }

    @Override
    public double getVolume() {
        return 4/3 * (Math.PI*Math.pow(radius,2));//высчитываем объем шара
    }
}
