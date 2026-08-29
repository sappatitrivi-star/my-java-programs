public class Np {

    
    public static String findUserEmail(String userId) {
        if ("id123".equals(userId)) {
            return "user@example.com";
        }
        
        return null; 
    }

    public static void main(String[] args) {
       
        String email = findUserEmail("id999"); 

        try {
            
            System.out.println("Email character count: " + email.length());
            
        } catch (NullPointerException e) {
          
            System.err.println(" Failed to get text length.  email reference was null.");
            System.err.println("Exception message: " + e.getMessage());
            
            
            System.out.println(" Please log in again.");
        }
    }
}