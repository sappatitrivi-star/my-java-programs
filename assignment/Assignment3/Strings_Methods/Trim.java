// String Method 10: trim()
// Real Application: Customer Name

class CustomerName {
    public static void main(String[] args) {

        String name = "   Rahul Kumar   ";

        String cleanName = name.trim();

        System.out.println("Original Name = [" + name + "]");
        System.out.println("Clean Name = [" + cleanName + "]");
    }
}