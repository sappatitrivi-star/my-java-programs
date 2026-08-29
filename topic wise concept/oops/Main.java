
class Employee {

    private int salary;

    public void setSalary(int s) {
        salary = s;
    }

    public int getSalary() {
        return salary;
    }
}

public class Main {

    public static void main(String args[]) {

        Employee e = new Employee();

        e.setSalary(50000);

        System.out.println(e.getSalary());
    }
}