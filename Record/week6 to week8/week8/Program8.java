interface SalaryDetails {

    void calculateSalary();
}

class Employee implements SalaryDetails {

    double basicSalary = 30000;
    double bonus = 5000;
    double deduction = 2000;

    public void calculateSalary() {

        double totalSalary =
                basicSalary + bonus - deduction;

        System.out.println("Basic Salary = " + basicSalary);
        System.out.println("Bonus = " + bonus);
        System.out.println("Deduction = " + deduction);
        System.out.println("Net Salary = " + totalSalary);
    }
}

public class Program8 {

    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.calculateSalary();
    }
}