import java.util.Scanner;

public class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]num = new int[5];
        System.out.println("enterd 5 numbers");
        for (int i = 0; i < num.length; i++) {
            num[i]=sc.nextInt();
        }
        System.out.println("you entered");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]+" ");
        }
        sc.close();
    }
}
            






