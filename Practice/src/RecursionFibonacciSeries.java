import java.util.Scanner;

public class RecursionFibonacciSeries {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to recursion fibonacci Series");
        System.out.print("Enter the no. of element you want : ");
        int count=input.nextInt();
        for (int i = 1; i <=count; i++) {
            System.out.print(fibonacci(i)+" ");
        }
    }
    public static int fibonacci(int pos) {
        if (pos==1){
            return 0;
        }
        if (pos==2){
            return 1;
        }
        return fibonacci(pos-1)+fibonacci(pos-2);
    }
}