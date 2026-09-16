import java.io.FileReader;
import java.io.IOException;

// Exception Handling
// Real Application: Employee File

class EmployeeFile {
    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("employee.txt");

            int data = file.read();
            System.out.println("Employee data read successfully.");

            file.close();
        }
        catch (IOException e) {
            System.out.println("Error: Unable to read employee file.");
        }
    }
}