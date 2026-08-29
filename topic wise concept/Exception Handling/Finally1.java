public class Finally1 {
    public static void main(String[] args) {
        String accountHolder = null;

        try {
           
            System.out.println("Checking name length: " + accountHolder.length());
            
        } catch (NullPointerException e) {
            System.out.println("Catch: the missing name error ");
            
        } finally {
           
            System.out.println("Finally: logging out of the banking session.");
        }
    }
}