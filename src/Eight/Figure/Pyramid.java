package Eight.Figure;

public class Pyramid extends Shape {
    protected double s;
    protected double h;

    public double getS() {
        return s;
    }

    public double getH() {
        return h;
    }

    public Pyramid(double volume, double s, double h) {
        super(volume);
        this.s = s;
        this.h = h;
    }

    @Override
    public double getVolume() {
        return 1/3*(s*h);//высчитываем объем пирамиды
    }
}
