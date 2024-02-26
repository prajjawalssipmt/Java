import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter the number to check : ");
        int num = input.nextInt();
        if(num>0){
            System.out.println("Positive Number");
        } else if (num<0) {
            System.out.println("Negative Number");
        }else {
            System.out.println("The number is Zero");
        }
    }
}
