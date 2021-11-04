public class Five {
    public static void main(String[] args) {
        Vector vector = new Vector(9, 10, 2);//задаем значения
        System.out.println(vector);

        Vector[] vectors = Vector.massiv(10);
        System.out.println(vectors[0].Vectorlenght());
        System.out.println(vectors[0].VectorSkal(vectors[1]));
        System.out.println(vectors[0].cross(vectors[1]));
        System.out.println(vectors[0].cosinus(vectors[1]));
        System.out.println(vectors[0].sum(vectors[1]));
        System.out.println(vectors[0].minus(vectors[1]));
    }
}

class Vector {
    double x; //инициализируем переменные
    double y;
    double z;

    public Vector(double x, double y, double z) {//создаем конструктор
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double Vectorlenght() { //длина вектора
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double VectorSkal(Vector c) { //скалярное произведение
        return (x * c.x + y * c.y + z * c.z);
    }

    public Vector cross(Vector v) { //векторное произведение
        return new Vector(y * v.z - z * v.y, z * v.x - x * v.z, x * v.y - y * v.x);
    }

    public double cosinus(Vector r) { //косинус
        return VectorSkal(r) / (Vectorlenght() * r.Vectorlenght());
    }

    public Vector sum(Vector s) { //сложение
        return new Vector(x + s.x, y + s.y, z + s.z);
    }

    public Vector minus(Vector m) { //вычитание
        return new Vector(x - m.x, y - m.y, z - m.z);
    }

    public static Vector[] massiv(int n) {
        Vector[] vectors = new Vector[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x'" + x + '\'' +
                ", y=" + y +
                ", z='" + z + '\'' +
                '}';
    }
}


