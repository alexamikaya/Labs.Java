package Eight.Tasks.Call;

abstract class Main {
    abstract Employee acceptCall(String type);

    Employee incomingcall(String type) {
        Employee employee = acceptCall(type);
        System.out.println("Соединяем " + employee.getWhatemployee());

            if (employee.priority == 1 && type.equals("answer")) {
                return new Operator("Nadya", "Operator", 1);
            } else if (employee.priority == 1 && type.equals("noanswer") && employee.priority == 2 && type.equals("answer")) {
                return new Manager("Sasha", "Manager", 2);
            } else return new Director("Kate", "Director", 3);

        }
    }
