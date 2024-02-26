import java.util.Scanner;

public class BitwiseRightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Right Shift Operator");
        System.out.print("Enter the number : ");
        int num = input.nextInt();

        int result = num>>1;
        System.out.println("Right shift is : "+result);
    }
}
