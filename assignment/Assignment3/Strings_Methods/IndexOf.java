// String Method 11: indexOf()
// Real Application: Email Validation

class EmailPosition {
    public static void main(String[] args) {

        String email = "student@gmail.com";

        int position = email.indexOf("@");

        System.out.println("Email = " + email);
        System.out.println("@ Position = " + position);
    }
}