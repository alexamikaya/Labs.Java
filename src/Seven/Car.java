package Seven;

public class Car extends Auto {
    protected long maxWeight;
    protected int wheels;


    public void newWheels(int wheels) {
        this.wheels = wheels;
    }

    public Car(long maxWeight, int wheels, String model, int Weight, char color, int speed) {
        this.maxWeight = 100;
        this.wheels = 6;
        super.model = "reno";
        super.weight = 10;
        super.color = '2';
        super.speed = 150;
    }

    @Override
    public String toString() {
        return "Максимальный вес " + maxWeight +
                " Реальный вес " + weight + " Цвет  " + color +
                " Скорость " + speed + " Количество колес " + wheels + " у модели " + model;
    }
}
