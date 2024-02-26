import java.util.Scanner;

public class BitwiseOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Right Shift Operator");
        System.out.print("Enter the number : ");
        int num = input.nextInt();

        if((num & 1) ==1){
            System.out.println("your Number is odd");
        }else {
            System.out.println("Number is Even");
        }
    }
}
