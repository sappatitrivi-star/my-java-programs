// Exception Handling
// Real Application: Student Marks

class StudentMarks {
    public static void main(String[] args) {

        int[] marks = {80, 75, 90};

        try {
            System.out.println("Student Mark = " + marks[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid mark position.");
        }
    }
}