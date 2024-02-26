import java.util.Scanner;

public class SwapTwoNum {
    public static void main(String[] args) {
//        int a=10, b=20, c;
//        c=a;
//        a=b;
//        b=c;
//        System.out.println("a = "+a);
//        System.out.println("b = "+b);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1= input.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2= input.nextInt();
        int num3= num1;
        num1= num2;
        num2=num3;
        System.out.println("Swapped number of num1 : "+num1 +" & num2 : "+num2);


    }
}
