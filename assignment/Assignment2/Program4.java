// Program 4: C1 implements I1, I2
// Application: Online Payment

interface Payment {
    void pay();
}

interface Receipt {
    void generateReceipt();
}

class OnlinePayment implements Payment, Receipt {

    double amount = 2500;
    double discount = 200;

    public void pay() {
        System.out.println("Amount = " + amount);
        System.out.println("Discount = " + discount);
        System.out.println("Final Amount = " + (amount - discount));
    }

    public void generateReceipt() {
        System.out.println("Payment receipt generated");
    }
}

public class Program4 {
    public static void main(String[] args) {

        OnlinePayment p = new OnlinePayment();

        p.pay();
        p.generateReceipt();
    }
}
