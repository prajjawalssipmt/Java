import java.util.Scanner;
//import java.lang.String;

public class TernaryEvenOdd {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Check no. is even or odd");
        System.out.print("enter  number: ");
        int num=input.nextInt();
        String result=(num%2==0)?"even":"odd";
        System.out.println(result);
    }
}
