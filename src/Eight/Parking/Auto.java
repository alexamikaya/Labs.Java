package Eight.Parking;

abstract class Auto{

    protected double area;

    public double getArea() {
        return area;
    }

    public Auto(double area) {
        this.area = area;

    }
    @Override
    public String toString(){
        return ""+ area;
    }
}
