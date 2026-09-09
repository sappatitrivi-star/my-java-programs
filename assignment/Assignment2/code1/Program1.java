class Employee{
    int salary = 30000;

    void showSalary() {
        System.out.println("Employee Salary = " + salary);
    }
}

class Manager extends Employee {
    int bonus = 5000;

    void showTotalSalary() {
        System.out.println("Bonus = " + bonus);
        System.out.println("Total Salary = " + (salary + bonus));
    }
}

public class Program1 {
    public static void main(String[] args) {

        Manager m = new Manager();

        m.showSalary();
        m.showTotalSalary();
    }
}

