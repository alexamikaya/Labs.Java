package Eight.Figure;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] { new Ball(2,4), new Pyramid(4, 2,7),
                new Cylindr(3, 3, 4) };
        Box box = new Box(300);
        for (Shape shape : shapes) {
            box.add(shape);
        }
        box.viewFigures();
    }
}
