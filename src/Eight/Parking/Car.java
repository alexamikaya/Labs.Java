package Eight.Parking;

public class Car extends Auto{
    protected double length;
    protected double weight;

    public double getLength() {
        return length;
    }

    public double getWeight() {
        return weight;
    }

    public Car(double area, double length, double weight) {
        super(area);
        this.length = length;
        this.weight = weight;
    }
    @Override
    public double getArea(){
        return length*weight;
    }
}
