

class BankAccount {

    double balance = 10000;

    void showBalance() {
        System.out.println("Initial Balance = " + balance);
    }
}

interface Deposit {

    void deposit(double amount);
}

interface Withdraw {

    void withdraw(double amount);
}

class SavingsAccount extends BankAccount implements Deposit, Withdraw {

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("After Deposit = " + balance);
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("After Withdrawal = " + balance);
    }
}

class CurrentAccount extends BankAccount implements Deposit {

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Current Account Balance = " + balance);
    }
}

public class Hybrid {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount();

        savings.showBalance();
        savings.deposit(5000);
        savings.withdraw(2000);

        CurrentAccount current = new CurrentAccount();

        current.showBalance();
        current.deposit(3000);
    }
}