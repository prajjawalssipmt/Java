import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the age : ");
        int age = input.nextInt();
        
        if(age >=60){
            System.out.println("senior citizen");
        } else if (/*age<60 && */age>=20) {
            System.out.println("Adult citizen");
        } else if (/*age<20 && */age>=13) {
            System.out.println("teenagers");
        }else {
            System.out.println("Children");
        }
    }
}
