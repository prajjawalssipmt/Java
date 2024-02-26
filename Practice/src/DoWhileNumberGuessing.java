import java.util.Scanner;

public class DoWhileNumberGuessing {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Number guessing game");
        int num=7,guess;
        do {
            System.out.print("Guess the number between 0-20 : ");
            guess =input.nextInt();
        }while (num != guess);
        System.out.println("You have successfully guess the number");
    }
}
