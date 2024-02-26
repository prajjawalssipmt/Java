import java.util.Scanner;

public class TernaryStudentScore {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to student card");
        System.out.print("Enter the score : ");
        int score = input.nextInt();

        String card= score>80 ? "High" : score>50 ? "Moderate" : "Low";
        System.out.println("Your Score card is "+card);
    }
}
