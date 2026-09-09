// String Method 6: equalsIgnoreCase()
// Real Application: Username Verification

class UsernameCheck {
    public static void main(String[] args) {

        String registeredName = "Trivikram";
        String enteredName = "TRIVIKRAM";

        if (registeredName.equalsIgnoreCase(enteredName)) {
            System.out.println("Username Matched");
        } else {
            System.out.println("Username Not Matched");
        }
    }
}