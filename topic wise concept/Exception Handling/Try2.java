public class Try2 {
    public static void main(String[] args) {
        
        String userInput = "0"; 
        int totalApples = 50;

        try {
            
            int numberOfPeople = Integer.parseInt(userInput); 
            
            
            int applesPerPerson = totalApples / numberOfPeople; 
            
            System.out.println("Each person gets " + applesPerPerson + " apples.");
            
        } 
        
        catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number, not text!");
        } 
        
        catch (ArithmeticException e) {
            System.out.println("Error: You cannot divide apples !");
        }

        System.out.println(" continues executing:");
    }
}