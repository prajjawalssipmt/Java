import java.util.Scanner;

public class WhileFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = 0;
        int second = 1;
        int count=0;
        System.out.println("This is a Fibonacci Series");
        System.out.print(" Enter the number of series : ");
        int series = input.nextInt();
        System.out.print(first + " "+second+ " ");
        while(count<series-2){
            int fibo = first + second;
            first = second;
            second=fibo;
            count++;
            System.out.print(fibo + " ");
        }
    }
}
