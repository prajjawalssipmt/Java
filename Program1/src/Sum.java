import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int num1,num2,sum;
        Scanner input = new Scanner(System.in);
        System.out.print("enter num1 : ");
        num1 = input.nextInt();
        System.out.print("enter num2 : ");
        num2 =input.nextInt();
        sum = num1 + num2;
        System.out.println("Sum of two number : "+sum);
    }
}
