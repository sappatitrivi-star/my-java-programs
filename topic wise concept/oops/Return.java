public class Return{
    public static int addNumbers(int a , int b){
        int sum=a+b;
        return sum;
    }
public static void main(String[] args) {
    int x=10;
    int y=20;
    int result = addNumbers(x,y);
    System.out.println("the sum of"+x+"and"+y+"is:"+result);

}
}