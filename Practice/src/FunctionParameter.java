import java.util.Scanner;

public class FunctionParameter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = 12;
//        addition(num1,num2);
//        System.out.println(addition(num1,num2));
        System.out.println("sum oftwo number is " + addition(num1,num2));
    }

    public static int addition(int a , int b) {
        int sum = a+b;
        return sum;
    }
}
