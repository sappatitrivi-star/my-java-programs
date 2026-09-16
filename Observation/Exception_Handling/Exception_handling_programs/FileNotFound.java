import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Exception Handling
// Real Application: Bank Statement

class BankStatement {
    public static void main(String[] args) {

        try {
            File file = new File("bankstatement.txt");
            Scanner sc = new Scanner(file);

            System.out.println("Bank statement opened successfully.");
            sc.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: Bank statement file not found.");
        }
    }
}