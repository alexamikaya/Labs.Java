package Seven;


public class Auto {
    public int weight;
    public String model;
    public char color;
    public float speed;


    public void outPut () {
        System.out.println("Вес " + model + " составляет " + weight + "кг.");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
    }

    public Auto (int w, String m, char c, float s) {
        weight = w;
        model = m;
        color = c;
        speed = s;
    }

    public Auto () {}
}
///В классе Грузовик создайте поля:
// количество колес;
///максимальный вес.

/// Также создайте метод newWheels, который устанавливает новое значение в поле «количество колес» и выводит его в консоль.

///   В класс Грузовик сделайте конструктор, устанавливающий все значения в конструктор главного класса и все значения в класс Грузовик.


