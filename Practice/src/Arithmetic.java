import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum,sub,mul,rem;
        double div;
        System.out.print("Enter 1st number : ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = input.nextInt();
        sum = num1+num2;
        sub = num1-num2;
        mul = num1*num2;
        div = (double)num1/num2;
        rem = num1%num2;
        System.out.println("\n sum : "+sum + "\n sub : " + sub + "\n mul : " + mul +"\n div : "+div + "\n rem : "+rem);
    }
}
