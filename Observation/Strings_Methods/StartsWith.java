// String Method 12: startsWith()
// Real Application: Country Code Check

class CountryCode {
    public static void main(String[] args) {

        String phone = "+91-9876543210";

        if (phone.startsWith("+91")) {
            System.out.println("Indian Mobile Number");
        } else {
            System.out.println("Other Country Number");
        }
    }
}