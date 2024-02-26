import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class SwitchMonth {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to display month ");

        System.out.print("Enter the number of month to display : ");
        int num=input.nextInt();

        String month = switch (num){
            case 1 -> "January";
            case 2 -> "Febuary";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "invalid input";
        };
        System.out.println(num+" month is "+month);
    }
}
