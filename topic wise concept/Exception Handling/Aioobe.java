public class Aioobe {
    public static void main(String[] args) {
        
        String[] pageProducts = {"Laptop", "Smartphone", "Wireless Headphones"};

        
        
        int userRequestedIndex = 3; 

        try {
            
            String selectedProduct = pageProducts[userRequestedIndex];
            System.out.println("Displaying: " + selectedProduct);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" System Error: Invalid product selection :");
            System.out.println("Details: " + e.getMessage());
            
            
            displayFallProduct(pageProducts);
        }
    }

    private static void displayFallProduct(String[] products) {
        System.out.println("Fallback: Redirecting user to  item " + products[0]);
    }
}