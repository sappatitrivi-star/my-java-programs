
class Person {

    private String name = "Rahul";

    void display() {
        System.out.println(name);
    }
}

public class Private {

    public static void main(String args[]) {

        Person p = new Person();

        p.display();

        
    }
}