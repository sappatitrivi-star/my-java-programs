import java.util.Scanner;

class Student {

    int rollNumber;
    String studentName;
    int[] marks;

    // Constructor
    Student(int rollNumber, String studentName, int[] marks) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.marks = marks;
    }

    // Calculate total marks
    int calculateTotal() {
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    // Calculate average marks
    double calculateAverage() {
        return calculateTotal() / (double) marks.length;
    }

    // Find highest mark
    int findHighest() {
        int highest = marks[0];

        for (int mark : marks) {
            highest = Math.max(highest, mark);
        }

        return highest;
    }

    // Find lowest mark
    int findLowest() {
        int lowest = marks[0];

        for (int mark : marks) {
            lowest = Math.min(lowest, mark);
        }

        return lowest;
    }

    // Calculate percentage
    double calculatePercentage() {
        int total = calculateTotal();
        return (total / (marks.length * 100.0)) * 100;
    }

    // Determine grade
    String determineGrade() {
        double percentage = calculatePercentage();

        if (percentage >= 90)
            return "A+";
        else if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 50)
            return "D";
        else
            return "F";
    }

    // Determine result
    String determineResult() {
        if (calculatePercentage() >= 50)
            return "PASS";
        else
            return "FAIL";
    }

    // Performance remark
    String performanceRemark() {
        double percentage = calculatePercentage();

        if (percentage >= 90)
            return "Excellent Performance";
        else if (percentage >= 80)
            return "Very Good Performance";
        else if (percentage >= 70)
            return "Good Performance";
        else if (percentage >= 60)
            return "Average Performance";
        else if (percentage >= 50)
            return "Needs Improvement";
        else
            return "Poor Performance";
    }

    // Display complete student details
    void displayDetails() {

        String formattedName = studentName.trim().toUpperCase();

        double percentage = calculatePercentage();

        // Round percentage to two decimal places
        double roundedPercentage = Math.round(percentage * 100.0) / 100.0;

        System.out.println("\n===== STUDENT PERFORMANCE REPORT =====");
        System.out.println("Roll Number       : " + rollNumber);
        System.out.println("Student Name      : " + formattedName);
        System.out.println("Name Length       : " + formattedName.length());

        System.out.println("Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + "         : " + marks[i]);
        }

        System.out.println("Total Marks       : " + calculateTotal());
        System.out.println("Average Marks     : " + calculateAverage());
        System.out.println("Highest Marks     : " + findHighest());
        System.out.println("Lowest Marks      : " + findLowest());
        System.out.println("Percentage        : " + roundedPercentage + "%");
        System.out.println("Grade             : " + determineGrade());
        System.out.println("Result            : " + determineResult());
        System.out.println("Performance       : " + performanceRemark());

        System.out.println("======================================");
    }
}

public class StudentPerformanceAnalysis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();

        sc.nextLine(); // Consume newline

        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        int[] marks = new int[5];

        System.out.println("Enter marks for 5 subjects:");

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Create Student object
        Student student = new Student(rollNumber, studentName, marks);

        // Display performance report
        student.displayDetails();

        sc.close();
    }
}