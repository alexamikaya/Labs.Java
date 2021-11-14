package Seven.Figure;

import java.util.ArrayList;
import java.util.Arrays;

public class Box extends Shape{
    private double finalVolume;
    private ArrayList<Shape> shapes;

    public Box(double volume) {
        super(volume);
        shapes = new ArrayList<>();
    }

    public boolean add(Shape shape) {
        finalVolume = finalVolume + shape.getVolume();
        if (finalVolume <= super.volume) {
            shapes.add(shape);
            return true;
        } else {
            System.out.println("нет места");
            return false;
        }
    }
    public void viewFigures() {
        System.out.println(Arrays.toString(shapes.toArray()));
    }
}
