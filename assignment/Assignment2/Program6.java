
interface Product {
    void showProduct();
}

interface ElectronicProduct extends Product {
    void showPrice();
}

class Laptop implements ElectronicProduct {

    String name = "Laptop";
    int price = 50000;

    public void showProduct() {
        System.out.println("Product = " + name);
    }

    public void showPrice() {
        System.out.println("Price = " + price);
    }
}

public class Program6 {
    public static void main(String[] args) {

        Laptop l = new Laptop();

        l.showProduct();
        l.showPrice();
    }
}
