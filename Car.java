public  class Car{
    String brand="toyoto";
    String name= "BMW";


void display(){
    System.out.println("Brand:"+brand);
    System.out.println("Name:"+ name);


}
public static void main(String[] args) {
    Car obj=new Car();
    obj.display();
}
}
