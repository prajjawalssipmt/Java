import java.util.Scanner;

public class FunctionFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        fact(num);
    }

    public static void fact(int n) {
        int factorial=1;
        for (int i=n;i>0;i--){

           factorial*=i;

        }
        System.out.println("factorial of "+n+" is "+factorial);
    }
}
