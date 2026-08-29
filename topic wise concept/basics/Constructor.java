class Student{
    String name;
    int age;
    Student(String a , int b){
        name = a;
        age = b;
    }
    void display(){
        System.out.println("Name:"+ name);
        System.out.println("Age:"+ age);
    }
    public static void main(String[] args) {
        Student s1 = new Student("Alice",10);
        Student s2 = new Student("Trivi",18);
        s1.display();
        s2.display();
        


    }
}
