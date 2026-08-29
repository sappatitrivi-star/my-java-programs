public class Throws1{
    
    public static int parseStringLength(String text) throws NullPointerException, NumberFormatException {
        
        
        if (text == null) {
            throw new NullPointerException("Input text cannot be null.");
        }

        
        int number = Integer.parseInt(text); 
        
        return number;
    }

    public static void main(String[] args) {
        
        
        try {
            System.out.println("Parsing 'abc'...");
            parseStringLength("abc"); 
        } catch (NumberFormatException e) {
            System.out.println("Caught Expected Error:  " + e.getMessage());
        }

        System.out.println(); 

        
        try {
            System.out.println("Parsing null value...");
            parseStringLength(null); 
        } catch (NullPointerException e) {
            System.out.println("Caught Expected Error: Pointer reference is null. " + e.getMessage());
        }
    }
}