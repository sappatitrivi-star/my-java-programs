public class PrimePalindrom {
    


    public static void main(String[] args) {

        // Check whether argument is provided
        if (args.length == 0) {
            System.out.println("Please enter a number as command line argument.");
            return;
        }

        int n = Integer.parseInt(args[0]);

        // Check Prime
        boolean prime = true;

        if (n <= 1) {
            prime = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        // Check Palindrome
        int original = n;
        int reverse = 0;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        boolean palindrome = (original == reverse);

        // Display result
        System.out.println("Number = " + original);

        if (prime && palindrome) {
            System.out.println(original + " is both Prime and Palindrome.");
        } 
        else if (prime) {
            System.out.println(original + " is Prime but not Palindrome.");
        } 
        else if (palindrome) {
            System.out.println(original + " is Palindrome but not Prime.");
        } 
        else {
            System.out.println(original + " is neither Prime nor Palindrome.");
        }
    }
}
