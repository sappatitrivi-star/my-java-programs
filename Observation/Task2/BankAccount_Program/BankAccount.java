// Base class
class Account {

    // Attributes
    int accountNumber;
    String accountHolderName;
    double balance;
    String accountType;

    // Constructor to initialize account details
    Account(int accountNumber, String accountHolderName,
            double balance, String accountType) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Method to deposit money
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    // Method to withdraw money
    void withdraw(double amount) {

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Method to transfer money
    void transfer(Account receiver, double amount) {

        if (amount <= balance) {
            balance = balance - amount;
            receiver.balance = receiver.balance + amount;

            System.out.println("Transferred: " + amount);
        } else {
            System.out.println("Insufficient balance for transfer");
        }
    }

    // Method to display account details
    void displayAccountDetails() {

        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}


// SavingsAccount inherits Account
class SavingsAccount extends Account {

    // Additional attribute
    double interestRate;

    // Constructor
    SavingsAccount(int accountNumber, String accountHolderName,
                   double balance, double interestRate) {

        super(accountNumber, accountHolderName, balance, "Savings");
        this.interestRate = interestRate;
    }

    // Method to calculate interest
    void calculateInterest() {

        double interest = balance * interestRate / 100;

        balance = balance + interest;

        System.out.println("Interest Added: " + interest);
    }
}


// CurrentAccount inherits Account
class CurrentAccount extends Account {

    // Additional attribute
    double overdraftLimit;

    // Constructor
    CurrentAccount(int accountNumber, String accountHolderName,
                   double balance, double overdraftLimit) {

        super(accountNumber, accountHolderName, balance, "Current");
        this.overdraftLimit = overdraftLimit;
    }

    // Overriding withdraw() method
    @Override
    void withdraw(double amount) {

        if (amount <= balance + overdraftLimit) {

            balance = balance - amount;

            System.out.println("Withdrawn: " + amount);

        } else {

            System.out.println("Withdrawal exceeds overdraft limit");
        }
    }
}


// Main class
class BankAccountDemo {

    public static void main(String[] args) {

        // Creating SavingsAccount object
        SavingsAccount savings =
            new SavingsAccount(101, "Rahul", 10000, 5);

        // Creating CurrentAccount object
        CurrentAccount current =
            new CurrentAccount(102, "Priya", 5000, 3000);


        // Display details before transactions
        System.out.println("===== BEFORE TRANSACTIONS =====");

        System.out.println("\nSavings Account Details:");
        savings.displayAccountDetails();

        System.out.println("\nCurrent Account Details:");
        current.displayAccountDetails();


        // Deposit operation
        System.out.println("\n===== DEPOSIT =====");

        savings.deposit(2000);
        current.deposit(3000);


        // Withdrawal operation
        System.out.println("\n===== WITHDRAWAL =====");

        savings.withdraw(1000);
        current.withdraw(9000);


        // Interest calculation
        System.out.println("\n===== INTEREST CALCULATION =====");

        savings.calculateInterest();


        // Fund transfer
        System.out.println("\n===== FUND TRANSFER =====");

        savings.transfer(current, 2000);


        // Display details after transactions
        System.out.println("\n===== AFTER TRANSACTIONS =====");

        System.out.println("\nSavings Account Details:");
        savings.displayAccountDetails();

        System.out.println("\nCurrent Account Details:");
        current.displayAccountDetails();


        // Final balances
        System.out.println("\n===== FINAL BALANCES =====");

        System.out.println("Savings Account Final Balance: "
                           + savings.balance);

        System.out.println("Current Account Final Balance: "
                           + current.balance);
    }
}