import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("Enter the number : ");
        num = input.nextInt();
        int sol=reverse(num);
        System.out.println("reverse of a number is : "+sol);

    }

    public static int reverse(int a) {

        int rev=0,rem;
        while (a>0) {
            rem = a % 10;
            rev = rev * 10 + rem;
            a = a / 10;
        }
        return rev;
    }
}
