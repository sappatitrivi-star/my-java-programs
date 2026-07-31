class NumA{
    int valueA;
    public NumA(int valueA){
        this.valueA=valueA;
    }
}
class NumB extends NumA{
    int valueB;
     public NumB(int valueA,int valueB){
        super(valueA);
        this.valueB=valueB;
     }
}


public class Main {
    public static void main(String[] args) {
        NumB numbers=new NumB(50,30);
        int sum=numbers.valueA+numbers.valueB;
        System.out.println("First number from (super class):"+numbers.valueA);
                System.out.println("First number from (sub class):"+numbers.valueB);
                        System.out.println("Total Sum:"+sum);

    }
}
