// String Method 9: replace()
// Real Application: Product URL

class ProductURL {
    public static void main(String[] args) {

        String productName = "Java Programming Book";

        String urlName = productName.replace(" ", "-");

        System.out.println("Product Name = " + productName);
        System.out.println("URL Name = " + urlName);
    }
}