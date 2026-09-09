// Exception Handling
// Real Application: Mobile Number

class MobileNumber {
    public static void main(String[] args) {

        String mobile = "9876543210";

        try {
            System.out.println("Digit = " + mobile.charAt(15));
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid mobile number position.");
        }
    }
}