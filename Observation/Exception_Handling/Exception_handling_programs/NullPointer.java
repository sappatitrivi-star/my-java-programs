// Exception Handling
// Real Application: Customer Details

class Customer {
    public static void main(String[] args) {

        String customerName = null;

        try {
            System.out.println("Customer Name Length = "
                    + customerName.length());
        }
        catch (NullPointerException e) {
            System.out.println("Error: Customer name is not available.");
        }
    }
}
