import java.util.Scanner;

public class FloatingProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st floating number : ");
        float x = input.nextFloat();
        System.out.print("Enter 2nd Floating number : ");
        float y = input.nextFloat();
        float  mul = x*y;
        System.out.println("Product of "+ x + " & " + y + " : "+ mul);

    }
}
