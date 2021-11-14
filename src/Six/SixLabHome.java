package Six;

public class SixLabHome {
    public static void main(String[] args) {
        Home home = new Home(2,2000,"Leo");


    }
}

class Home {
    static int floar;
    static int year;
    static String name;

    public Home(int floar, int year, String name) {
        this.floar = floar;
        this.year = year;
        this.name = name;
    }
public static void home2(){
        Home.floar = 12;
        Home.year = 2003;
        Home.name ="Jasmin";

    }
    public static void home3(){
        Home.floar = 7;
        Home.year = 2020;
        Home.name ="JLC";
    }
    @Override
    public String toString() {
        return "Объект {" +
                "Название постройки'" + name + '\'' +
                ", Год постройки" + year +
                ", КОличество этажей'" + floar + '\'' +
                '}';
    }
}