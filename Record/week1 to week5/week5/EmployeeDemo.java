class Employee {
    String name;
    int id;
    String designation;
    double salary;
    String promotionStatus;

    // Constructor 1: Default constructor
    Employee() {
        name = "Unknown";
        id = 0;
        designation = "Not Assigned";
        salary = 0.0;
        promotionStatus = "Not Eligible";
    }

    // Constructor 2: Constructor with name and id
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        designation = "Employee";
        salary = 20000;
        promotionStatus = "Pending";
    }

    // Constructor 3: Constructor with all employee details
    Employee(String name, int id, String designation,
             double salary, String promotionStatus) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
        this.promotionStatus = promotionStatus;
    }

    // Method to display employee details
    void display() {
        System.out.println("Name              : " + name);
        System.out.println("ID                : " + id);
        System.out.println("Designation       : " + designation);
        System.out.println("Salary            : " + salary);
        System.out.println("Promotion Status  : " + promotionStatus);
        System.out.println("--------------------------------");
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        // Using default constructor
        Employee e1 = new Employee();

        // Using constructor with name and id
        Employee e2 = new Employee("Rahul", 101);

        // Using constructor with all details
        Employee e3 = new Employee(
            "Priya", 102, "Manager", 65000, "Eligible"
        );

        e1.display();
        e2.display();
        e3.display();
    }
}