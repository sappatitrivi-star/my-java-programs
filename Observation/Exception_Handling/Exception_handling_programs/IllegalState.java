// Exception Handling
// Real Application: Online Order

class OnlineOrder {

    static boolean orderPlaced = false;

    static void cancelOrder() {

        if (!orderPlaced) {
            throw new IllegalStateException(
                "Order cannot be cancelled before placing.");
        }

        System.out.println("Order cancelled successfully.");
    }

    public static void main(String[] args) {

        try {
            cancelOrder();
        }
        catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}