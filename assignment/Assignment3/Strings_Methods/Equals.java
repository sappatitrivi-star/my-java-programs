// String Method 5: equals()
// Real Application: Password Verification

class PasswordCheck {
    public static void main(String[] args) {

        String password = "Java123";
        String enteredPassword = "Java123";

        if (password.equals(enteredPassword)) {
            System.out.println("Password Matched");
        } else {
            System.out.println("Incorrect Password");
        }
    }
}