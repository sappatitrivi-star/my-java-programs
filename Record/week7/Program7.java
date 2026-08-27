class Bank {

    double calculateInterest(double amount) {
        return amount * 0.05;
    }
}

class SBI extends Bank {

    @Override
    double calculateInterest(double amount) {
        return amount * 0.06;
    }
}

class HDFC extends Bank {

    @Override
    double calculateInterest(double amount) {
        return amount * 0.07;
    }
}

public class Program7 {

    public static void main(String[] args) {

        double amount = 10000;

        Bank b;

        b = new SBI();
        System.out.println("SBI Interest = " +
                b.calculateInterest(amount));

        b = new HDFC();
        System.out.println("HDFC Interest = " +
                b.calculateInterest(amount));
    }
}