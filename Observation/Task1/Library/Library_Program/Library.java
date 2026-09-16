// Class Books demonstrates Encapsulation,
// Constructors, Getters and Setters
class Books {

    // Private data members
    private int bookId;
    private String bookName;
    private String author;
    private double price;

    // Default Constructor
    public Books() {
        System.out.println("Default Constructor Called");
    }

    // Parameterized Constructor
    public Books(int id, String name, String author, double price) {
        this.bookId = id;
        this.bookName = name;
        this.author = author;
        this.price = price;
    }

    // Setter methods are used to assign values
    public void setBookId(int id) {
        bookId = id;
    }

    public void setBookName(String name) {
        bookName = name;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public void setPrice(double p) {
        price = p;
    }

    // Getter methods are used to access values
    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    // Method to display book details
    public void display() {
        System.out.println("Book ID : " + bookId);
        System.out.println("Book Name : " + bookName);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }
}


// Parent class
// Demonstrates Inheritance
class Person1 {
    String name = "priya";
    int age = 22;
}


// Student1 inherits properties from Person1
class Student1 extends Person1 {

    int rollNo = 156;

    // Method to display student details
    void displayStudent() {
        System.out.println("\nStudent Details");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Roll No : " + rollNo);
    }
}


// Faculty1 inherits properties from Person1
class Faculty1 extends Person1 {

    String subject = "Java";

    // Method to display faculty details
    void displayFaculty() {
        System.out.println("\nFaculty Details");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Subject : " + subject);
    }
}


// Class Areas demonstrates Method Overloading
class Areas {

    // Method to calculate area of square
    void area(int side) {
        System.out.println("\nArea of Square = " + (side * side));
    }

    // Overloaded method to calculate area of rectangle
    void area(int length, int breadth) {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }

    // Overloaded method to calculate area of circle
    void area(double radius) {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }
}


// Parent class for Method Overriding
class Vehicles {

    // Parent class display method
    void display() {
        System.out.println("\nThis is a Vehicle");
    }
}


// Cars inherits Vehicles
class Cars extends Vehicles {

    // Overriding display method
    void display() {
        System.out.println("This is a Car");
    }
}


// Bikes inherits Vehicles
class Bikes extends Vehicles {

    // Overriding display method
    void display() {
        System.out.println("This is a Bike");
    }
}


// Abstract class
abstract class Shapes {

    // Abstract method
    abstract void draw();
}


// Circles inherits abstract class Shapes
class Circles extends Shapes {

    // Implementing the abstract method
    void draw() {
        System.out.println("\nDrawing Circle");
    }
}


// Rectangles inherits abstract class Shapes
class Rectangles extends Shapes {

    // Implementing the abstract method
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}


// Interface
interface Prints {

    // Abstract method in interface
    void print();
}


// Reports implements Prints interface
class Reports implements Prints {

    // Implementing the interface method
    public void print() {
        System.out.println("\nPrinting Library Report");
    }
}


// Main class
public class Library {

    public static void main(String[] args) {

        // Creating object using Default Constructor
        Books b1 = new Books();

        // Setting book details using Setter methods
        b1.setBookId(167);
        b1.setBookName("Java Programming");
        b1.setAuthor("James Gosling");
        b1.setPrice(599);

        // Displaying first book details
        System.out.println("\nBook Details");
        b1.display();


        // Creating object using Parameterized Constructor
        Books b2 = new Books(102, "Python", "Guido", 700);

        // Displaying second book details
        System.out.println("\nParameterized Constructor");
        b2.display();


        // Creating Student object
        // Demonstrates Inheritance
        Student1 s = new Student1();
        s.displayStudent();


        // Creating Faculty object
        // Demonstrates Inheritance
        Faculty1 f = new Faculty1();
        f.displayFaculty();


        // Creating Areas object
        Areas a = new Areas();

        // Method Overloading
        // Same method name with different parameters
        a.area(6);          // Square
        a.area(10, 24);     // Rectangle
        a.area(3.7);        // Circle


        // Method Overriding
        Vehicles v;

        // Parent reference pointing to Car object
        v = new Cars();
        v.display();

        // Parent reference pointing to Bike object
        v = new Bikes();
        v.display();


        // Abstract class reference
        Shapes sh;

        // Shapes reference pointing to Circle object
        sh = new Circles();
        sh.draw();

        // Shapes reference pointing to Rectangle object
        sh = new Rectangles();
        sh.draw();


        // Creating Reports object
        // Demonstrates Interface implementation
        Reports r = new Reports();
        r.print();
    }
}