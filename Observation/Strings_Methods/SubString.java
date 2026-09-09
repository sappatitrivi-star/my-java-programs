// String Method 7: substring()
// Real Application: Extract Username from Email

class EmailUsername {
    public static void main(String[] args) {

        String email = "student@gmail.com";

        int position = email.indexOf("@");

        String username = email.substring(0, position);

        System.out.println("Email = " + email);
        System.out.println("Username = " + username);
    }
}