// String Method 8: contains()
// Real Application: Product Search

class ProductSearch {
    public static void main(String[] args) {

        String product = "HP Laptop with 8GB RAM";

        if (product.contains("Laptop")) {
            System.out.println("Laptop is available in the product description");
        } else {
            System.out.println("Laptop not found");
        }
    }
}