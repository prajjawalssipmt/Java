import java.util.Scanner;

public class BitwiseNOT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is an compliment operator");
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        int result = ~num;
        System.out.print("Compilment is : "+result);
    }
}
