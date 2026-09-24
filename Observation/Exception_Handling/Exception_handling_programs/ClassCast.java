// Exception Handling
// Real Application: Employee Management

class Employee {
}

class Manager extends Employee {
}

class Developer extends Employee {
}

class EmployeeSystem {
    public static void main(String[] args) {

        Employee emp = new Developer();

        try {
            Manager manager = (Manager) emp;
            System.out.println("Employee is a Manager.");
        }
        catch (ClassCastException e) {
            System.out.println("Error: Employee is not a Manager.");
        }
    }
}