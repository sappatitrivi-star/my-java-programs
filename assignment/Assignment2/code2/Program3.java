
interface Electricity {
    void calculateBill();
}

class House implements Electricity {

    int units = 100;
    int rate = 6;

    public void calculateBill() {
        int bill = units * rate;
        System.out.println("Units Consumed = " + units);
        System.out.println("Rate per Unit = " + rate);
        System.out.println("Electricity Bill = " + bill);
    }
}

public class Program3 {
    public static void main(String[] args) {

        House h = new House();
        h.calculateBill();
    }
}
