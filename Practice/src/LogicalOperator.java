import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Ticket Discount Calculator");
        System.out.print("Enter your age : ");
        int age = input.nextInt();
        System.out.print("Are you female ? (true/false) : ");
        boolean isFemale = input.nextBoolean();

        if(age<5){
            System.out.println("you are eligible for 75% discount");
        } else if (isFemale) {
            System.out.println("You got 50% discount");
        } else if (age>60 && !isFemale) {
            System.out.println("25% discount for you");
        }else{
            System.out.println("no discount");
        }

    }
}
