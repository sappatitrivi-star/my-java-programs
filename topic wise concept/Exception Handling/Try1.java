public class Try1 {
    public static void main(String[] args) {
        int totalCalculators = 10;
        int students = 0; 

        
        try {
            int calculatorsPerStudent = totalCalculators / students;
            System.out.println("Each student gets: " + calculatorsPerStudent);
        } 
        
        catch (ArithmeticException e) {
            System.out.println("Error: You cannot divide !");
        }

        System.out.println("Program continues ");
    }
}