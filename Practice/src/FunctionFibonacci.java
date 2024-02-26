import java.util.Scanner;

public class FunctionFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();

        fibonacci(num);
    }

    public static int fibonacci(int n) {
        int i=0,a=0,b=1,fib;
        System.out.print("Fibonacci series is : "+a+" "+b +" ");
        while(i<n-2){
            fib = a+b;
            a=b;
            b=fib;
            System.out.print(fib+" ");
            i++;
        }
        return 0 ;
    }
}
