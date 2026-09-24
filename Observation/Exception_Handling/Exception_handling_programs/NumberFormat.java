// Exception Handling
// Real Application: Bank Account

class BankAccount {
    public static void main(String[] args) {

        String balance = "ABC";

        try {
            int amount = Integer.parseInt(balance);
            System.out.println("Balance = " + amount);
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Invalid balance format.");
        }
    }
}