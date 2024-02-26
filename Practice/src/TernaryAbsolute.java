import java.util.Scanner;

public class TernaryAbsolute {
    public static void main(String[] args) {
        System.out.println("Welcome to Absolute Value");
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        int abs = num>=0?num:-num;
        System.out.println("Avolute value is "+abs);
    }
}
