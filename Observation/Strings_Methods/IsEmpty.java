// String Method 15: isEmpty()
// Real Application: Registration Form

class RegistrationCheck {
    public static void main(String[] args) {

        String name = "";

        if (name.isEmpty()) {
            System.out.println("Name cannot be empty");
        } else {
            System.out.println("Registration Successful");
        }
    }
}