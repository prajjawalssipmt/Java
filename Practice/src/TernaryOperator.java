import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to check biggest of two number");
        System.out.print("Enter 1st number : ");
        int a= input.nextInt();
        System.out.print    ("Enter 2nd number : ");
        int b= input.nextInt();

        int result = a > b ? a:b;
        System.out.println(result+" is greater");

    }
}
