// Exception Handling
// Real Application: Company Security

class CompanySecurity {
    public static void main(String[] args) {

        try {
            throw new SecurityException(
                "Access denied to company resource.");
        }
        catch (SecurityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}