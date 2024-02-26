import java.util.Scanner;

public class FunctionRightHalfPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        pattern(num);
    }

    public static void pattern(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
