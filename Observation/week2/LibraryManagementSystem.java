class Books {

    private int bookId;
    private String bookName;
    private String author;
    private double price;
    public Books() {
        System.out.println("Default Constructor Called");
    }
    public Books(int id, String name, String author, double price) {
        this.bookId = id;
        this.bookName = name;
        this.author = author;
        this.price = price;
    }

    //getters  Setters
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

    // Getters
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

    public void display() {
        System.out.println("Book ID : " + bookId);
        System.out.println("Book Name : " + bookName);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }
}


class Person1 {
    String name = "priya";
    int age = 22;
}

class Student1 extends Person1 {
    int rollNo = 156;

    void displayStudent() {
        System.out.println("\nStudent Details");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Roll No : " + rollNo);
    }
}

class Faculty1 extends Person1 {
    String subject = "Java";

    void displayFaculty() {
        System.out.println("\nFaculty Details");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Subject : " + subject);
    }
}

class Areas {

    // Method Overloading
    void area(int side) {
        System.out.println("\nArea of Square = " + (side * side));
    }

    void area(int length, int breadth) {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }

    void area(double radius) {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }
}

// Method Overriding

class Vehicles {
    void display() {
        System.out.println("\nThis is a Vehicle");
    }
}

class Cars extends Vehicles {
    void display() {
        System.out.println("This is a Car");
    }
}

class Bikes extends Vehicles {
    void display() {
        System.out.println("This is a Bike");
    }
}

abstract class Shapes {
    abstract void draw();
}

class Circles extends Shapes {
    void draw() {
        System.out.println("\nDrawing Circle");
    }
}

class Rectangles extends Shapes {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}
interface Prints {
    void print();
}

class Reports implements Prints {
    public void print() {
        System.out.println("\nPrinting Library Report");
    }
}


public class LibraryManagementSystem {

    public static void main(String[] args) {
        Books b1 = new Books();

        b1.setBookId(167);
        b1.setBookName("Java Programming");
        b1.setAuthor("James Gosling");
        b1.setPrice(599);

        System.out.println("\nBook Details");
        b1.display();

        Books b2 = new Books(102, "Python", "Guido", 700);

        System.out.println("\nParameterized Constructor");
        b2.display();
        Student1 s = new Student1();
        s.displayStudent();

        Faculty1 f = new Faculty1();
        f.displayFaculty();

        // Method Overloading
        Areas a = new Areas();
        a.area(6);
        a.area(10, 24);
        a.area(3.7);

        // Method Overriding
        Vehicles v;

        v = new Cars();
        v.display();

        v = new Bikes();
        v.display();
        Shapes sh;

        sh = new Circles();
        sh.draw();

        sh = new Rectangles();
        sh.draw();
        Reports r = new Reports();
        r.print();
    }
}