import java.util.Scanner;

public class BitwiseLeftShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Left Shift Operator");
        System.out.print("Enter the number : ");
        int num = input.nextInt();

        int result = num<<1;
        System.out.println("left shift is : "+result);
    }
}
