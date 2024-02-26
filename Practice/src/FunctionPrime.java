import java.util.Scanner;

public class FunctionPrime {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to check whether the number is prime or not");
        System.out.print("Enter the number : ");
        int num= input.nextInt();
        System.out.println("your number is "+(isPrime(num)?"Prime":"Not Prime"));
    }
    public static boolean isPrime(int n){
        for (int i = 2; i < n; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
