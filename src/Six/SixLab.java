package Six;

public class SixLab {
    public static void main(String[] args) {
        Study course = new Study();
        System.out.println(Study.printCourse());
    }
}

class Study {
    private static String course;

    //TODO
    public Study(){
        this.course = "Изучение Java - это просто!";
    }


    public static String printCourse() {
        return course;
    }
    @Override
    public String toString() {
        return course;
    }
}


class JavaProgram {
    public static void main(String[] args) {
//TODO
    }
}