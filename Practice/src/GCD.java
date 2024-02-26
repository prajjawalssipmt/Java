import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,gcd=1;

        System.out.print("Enter the first number : ");
        a = input.nextInt();
        System.out.print("Enter the second number : ");
        b= input.nextInt();

        for (int i = 1; i <= a && i<=b ; i++) {

            if (a%i==0 && b%i==0){
                gcd =i;

            }

        }
        System.out.println("GCD of two number is : "  +gcd);
    }
}
