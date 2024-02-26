import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.print("Enter the first number : ");
        a = input.nextInt();
        System.out.print("Enter the second number : ");
        b = input.nextInt();

        for (int i = 1; i <a*b ; i++) {
            if (i%a==0 && i%b==0){
                int lcm = i;
                System.out.println("LCM of two number : "+lcm);
                break;

            }

        }
    }
}
