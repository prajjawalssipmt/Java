import java.util.Scanner;

public class GradeMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter marks to check grade : ");
        float percent = input.nextFloat();

        if (percent>=90){
            System.out.println("Grade A");
        } else if (percent>=75) {
            System.out.println("Grade B");
        } else if (percent>=60) {
            System.out.println("Grade C");
        }else if (percent>=33) {
            System.out.println("Grade D");
    }else {
            System.out.println("Grade F");
        }
    }
}
