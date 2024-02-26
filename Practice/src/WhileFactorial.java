import java.util.Scanner;

public class WhileFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Factorial Series");
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        int fact = 0;
        while(num>0){
             fact+= num;
             num--;
        }
        System.out.println("Factorial is : "+fact);
    }
}
