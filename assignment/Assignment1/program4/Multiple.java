

interface BasicSalary {

    void calculateBasic();
}

interface Bonus {

    void calculateBonus();
}

class Employee implements BasicSalary, Bonus {

    int salary = 30000;
    int bonus = 5000;

    public void calculateBasic() {
        System.out.println("Basic Salary = " + salary);
    }

    public void calculateBonus() {
        System.out.println("Bonus = " + bonus);
    }

    void totalSalary() {
        System.out.println("Total Salary = " + (salary + bonus));
    }
}

public class Multiple {
    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.calculateBasic();
        emp.calculateBonus();
        emp.totalSalary();
    }
}