
class Student {

    private int age;

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }
}

public class Encapsulation {

    public static void main(String args[]) {

        Student s = new Student();

        s.setAge(20);

        System.out.println(s.getAge());
    }
}
