package Seven.Figure;

public class Shape {
    public double volume;

    public double getVolume() {
        return volume;
    }

    public Shape(double volume) {
        this.volume = volume;
    }
    @Override
    public String toString(){
        return ""+ volume;
    }
}
