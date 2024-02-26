import java.util.Scanner;

public class FunctionPalindrome {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        palindrome(num);
    }

    public static int palindrome(int n) {
        int rev=0,temp=n,sum=0;
        while(n >0){
             rev =n%10;
             sum = sum *10 + rev;
             n=n/10;

        }
        if (temp==sum){
            System.out.println("Palindrome number");
        }else {
            System.out.println("Not a palindrome number");
        }
        return 0;
    }
}
