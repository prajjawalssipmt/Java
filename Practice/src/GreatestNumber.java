import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the three number : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if(a>b && a>c){
            System.out.println(a + " is the greatest number");
        } else if (b>a && b>c) {
            System.out.println(b + " is the greatest number");
        }else {
            System.out.println(c + " is the greatest number");
        }
    }
}
