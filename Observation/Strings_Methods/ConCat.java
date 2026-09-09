// String Method 14: concat()
// Real Application: Full Name

class FullName {
    public static void main(String[] args) {

        String firstName = "Rahul";
        String lastName = "Kumar";

        String fullName = firstName.concat(" ").concat(lastName);

        System.out.println("First Name = " + firstName);
        System.out.println("Last Name = " + lastName);
        System.out.println("Full Name = " + fullName);
    }
}