import java.util.Scanner;

public class BitwiseXOR {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Showing Bitwise XOR Opeator");
        System.out.print("Enter the first number : ");
        int first = input.nextInt();
        System.out.print("Enter the second number : ");
        int second = input.nextInt();

        int result = first ^ second;
        System.out.println("Bitwise XOR is : "+result);
    }
}
