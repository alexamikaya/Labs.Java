package Eight.Parking;

import Seven.Figure.Shape;

public class Main {
    public static void main(String[] args){
        Auto[] autos = new Auto[]{
                new Car(4,2,2),
                new Bus(80,8,10)
        };
        Parking parking = new Parking(10);
        for (Auto auto : autos) {
            parking.add(auto);
        }
        parking.viewAutos();
    }
}
