import java.util.Scanner;

public class FunctionLeftHalfpatten {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        leftstar(num);
    }

    public static void leftstar(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 2*(n-i); j >=0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        
    }
}
