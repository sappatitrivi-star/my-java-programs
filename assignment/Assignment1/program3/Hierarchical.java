
class Shape {
    void message() {
        System.out.println("Calculating Area");
    }
}

class Rectangle extends Shape {

    int length = 10;
    int width = 5;

    void area() {
        System.out.println("Rectangle Area = " + (length * width));
    }
}

class Circle extends Shape {

    double radius = 7;

    void area() {
        System.out.println("Circle Area = " + (3.14 * radius * radius));
    }
}

public class Hierarchical {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        r.message();
        r.area();

        Circle c = new Circle();
        c.message();
        c.area();
    }
}