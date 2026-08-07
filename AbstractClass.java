abstract class Animal{
    void sleep(){
        System.out.println("animal is sleep");
    }
    abstract void make();
}
abstract class Animal2{
    void sleep(){
        System.out.println("sleep");
    }
    abstract void sound();
}
class Dog extends Animal2{
    void sound(){
        System.out.println("Bark");
    }
}


public class AbstractClass {
    public static void main(String[] args) {
        Dog myDog=new Dog();
        myDog.sound();
        myDog.sleep();

    }
}
