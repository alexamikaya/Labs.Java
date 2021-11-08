package Six;

public class SixLabTree {
    Tree one = new Tree();
    Tree two = new Tree(21,"KKK");
    Tree three = new Tree(12, true, "LLL");
    System.out.println(one);
    System.out.println(two);
    System.out.println(three);

}
class Tree {
    int old;
    boolean alive;
    String name;

    public Tree(int old, String name) {
        this.old = 12;
        this.name = "Kedr23";

    }

    public Tree(int old, boolean alive, String name) {
        this.old = old;
        this.alive = alive;
        this.name = name;
    }

    public Tree() {
        this.old = 0;
        this.alive = false;
        this.name = "No name";
        System.out.println("Пустой конструктор без параметров сработал");

    }

    @Override
    public String toString() {
        return "Дерево " + name +
                "{Возраст " + old + " лет, " +
                "Живое?" + alive +
                '}';
    }
}