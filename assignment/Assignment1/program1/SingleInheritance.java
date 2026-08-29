class Calculator {
    int a = 20;
    int b = 10;

    void addition() {
        System.out.println("Addition = " + (a + b));
    }

    void subtraction() {
        System.out.println("Subtraction = " + (a - b));
    }
}

class AdvancedCalculator extends Calculator {

    void multiplication() {
        System.out.println("Multiplication = " + (a * b));
    }

    void division() {
        System.out.println("Division = " + (a / b));
    }
}

public class SingleInheritance {
    public static void main(String[] args) {

        AdvancedCalculator obj = new AdvancedCalculator();

        obj.addition();
        obj.subtraction();
        obj.multiplication();
        obj.division();
    }
}