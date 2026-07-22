// Main class to run the program
public class Parameters {
    public Parameters() {
        System.out.println("Constructor called: Object has been created!");
    }

    
    public void displayMessage() {
        System.out.println("Method called: This code runs without any parameters.");
    }

    
    public static void main(String[] args) {
        
        Parameters myObject = new Parameters();

        
        myObject.displayMessage();
    }
}
