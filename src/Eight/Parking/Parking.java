package Eight.Parking;
import Seven.Figure.Shape;

import java.util.ArrayList;
import java.util.Arrays;

public class Parking extends Auto {
    private double finalArea;
    private ArrayList<Auto> autos;

    public Parking(double area) {
        super(area);

        autos = new ArrayList<>();
    }
    public boolean add(Auto auto) {
        finalArea = finalArea + auto.getArea();
        if (finalArea <= super.area) {
            autos.add(auto);
            return true;
        } else {
            System.out.println("нет места");
            return false;
        }
    }
    public void viewAutos() {
        System.out.println(Arrays.toString(autos.toArray()));
    }

}
