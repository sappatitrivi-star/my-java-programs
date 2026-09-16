// Interface
interface PaymentService {

    // Method to make payment
    void pay(String receiverUPI, double amount)
            throws InvalidUPIException,
                   InvalidAmountException,
                   InsufficientBalanceException;

    // Method to check balance
    void checkBalance();
}


// Custom Exception 1
class InsufficientBalanceException extends Exception {

    // Constructor
    InsufficientBalanceException(String message) {
        super(message);
    }
}


// Custom Exception 2
class InvalidUPIException extends Exception {

    // Constructor
    InvalidUPIException(String message) {
        super(message);
    }
}


// Custom Exception 3
class InvalidAmountException extends Exception {

    // Constructor
    InvalidAmountException(String message) {
        super(message);
    }
}


// Wallet class
class Wallet {

    // Private data members for encapsulation
    private String userName;
    private String mobileNumber;
    private String upiId;
    private double balance;

    // Constructor to initialize wallet details
    Wallet(String userName, String mobileNumber,
           String upiId, double balance) {

        this.userName = userName;
        this.mobileNumber = mobileNumber;
        this.upiId = upiId;
        this.balance = balance;
    }

    // Method to add money
    void addMoney(double amount) throws InvalidAmountException {

        // Check whether amount is valid
        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Invalid amount. Amount must be greater than zero.");
        }

        // Add money to balance
        balance = balance + amount;

        System.out.println("Money added successfully: Rs." + amount);
    }

    // Method to get current balance
    double getBalance() {
        return balance;
    }

    // Method to get UPI ID
    String getUpiId() {
        return upiId;
    }

    // Method to display wallet details
    void displayWalletDetails() {

        System.out.println("\n===== WALLET DETAILS =====");
        System.out.println("User Name    : " + userName);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("UPI ID       : " + upiId);
        System.out.println("Balance      : Rs." + balance);
    }
}


// UPIPayment class implements interface
class UPIPayment implements PaymentService {

    // Wallet object
    private Wallet wallet;

    // Constructor
    UPIPayment(Wallet wallet) {
        this.wallet = wallet;
    }

    // Implementing pay() method
    public void pay(String receiverUPI, double amount)
            throws InvalidUPIException,
                   InvalidAmountException,
                   InsufficientBalanceException {

        // Validate UPI ID
        // UPI ID must contain '@'
        if (receiverUPI == null ||
            !receiverUPI.contains("@")) {

            throw new InvalidUPIException(
                    "Invalid UPI ID. Payment cancelled.");
        }

        // Validate payment amount
        if (amount <= 0) {

            throw new InvalidAmountException(
                    "Invalid payment amount. Amount must be greater than zero.");
        }

        // Check available balance
        if (amount > wallet.getBalance()) {

            throw new InsufficientBalanceException(
                    "Insufficient balance. Payment cancelled.");
        }

        // Deduct amount from wallet
        // We use addMoney() with negative amount is not possible,
        // so payment deduction is handled through this method.
        deductAmount(amount);

        // Display successful transaction
        System.out.println("\nPayment Successful!");
        System.out.println("Receiver UPI : " + receiverUPI);
        System.out.println("Amount Paid   : Rs." + amount);
    }

    // Private method to deduct money
    private void deductAmount(double amount) {

        try {
            // Use reflection to update private balance
            java.lang.reflect.Field field =
                    Wallet.class.getDeclaredField("balance");

            field.setAccessible(true);

            double currentBalance =
                    (double) field.get(wallet);

            field.set(wallet, currentBalance - amount);

        } catch (Exception e) {
            System.out.println("Unable to process payment.");
        }
    }

    // Implementing checkBalance() method
    public void checkBalance() {

        System.out.println(
                "Available Balance: Rs." + wallet.getBalance());
    }
}


// Main class
public class DigitalPaymentDemo {

    public static void main(String[] args) {

        // Create Wallet object
        Wallet wallet = new Wallet(
                "Trivikram",
                "9876543210",
                "Trivikram@upi",
                1000.0
        );

        // Create UPIPayment object
        UPIPayment payment = new UPIPayment(wallet);

        // Display initial wallet details
        wallet.displayWalletDetails();

        try {

            // Add money to wallet
            wallet.addMoney(500);

            // Check balance
            payment.checkBalance();

            // Make UPI payment
            payment.pay("rahul@upi", 700);

        } catch (InvalidUPIException e) {

            // Handle invalid UPI exception
            System.out.println("Transaction Error: "
                    + e.getMessage());

        } catch (InvalidAmountException e) {

            // Handle invalid amount exception
            System.out.println("Transaction Error: "
                    + e.getMessage());

        } catch (InsufficientBalanceException e) {

            // Handle insufficient balance exception
            System.out.println("Transaction Error: "
                    + e.getMessage());

        } finally {

            // This block always executes
            System.out.println("\nTransaction process completed.");
        }

        // Display final wallet details
        wallet.displayWalletDetails();

        // Display final balance
        payment.checkBalance();
    }
}