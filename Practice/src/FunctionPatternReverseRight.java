import java.util.Scanner;

public class FunctionPatternReverseRight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();
        pattern(num);
    }

    public static void pattern(int n) {
        for (int i = n; i >=0 ; i--) {
            for (int j = i; j >0 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
