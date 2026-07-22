public class Constructor{
    String name;
    int age;
   public  Constructor(string a,int b){
    a=name;
    b=age;

    }
    public Constructor(){
        name="trivi";
        age=18;

    }
    void display(){
        System.out.println("student name:"+name+"student age:"+age);
         
        
    }
    public static void main(String[] args) {
        Constructor s1=new Constructor("trivi",19);
        Constructor s2=new Constructor();

    
    s1.display();
    s2.display();

    }
    

}