package Eight.Tasks.Call;

abstract class Employee {
    private String name;
    private String whatemployee;
    public int priority;

    Employee(String name, String whatemployee, int priority) {
        this.name = name;
        this.whatemployee = whatemployee;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public String getWhatemployee() {
        return whatemployee;
    }
    void busy(){System.out.println("Сотрудник занят, переводим звонок на вышестоящего");}
    void notbusy(){System.out.println("Сотрудник свободен, соединяем");}
}
