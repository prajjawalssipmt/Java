import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Driving License Portal");
        System.out.print("Enter your age : ");
        int age = input.nextInt();

        if(age>=18){
            System.out.println("you are eligible for driving license.");
        }else{
            System.out.println("you are not eligible.");
        }
    }
}
