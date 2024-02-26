import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to switch calculator");
        System.out.print("Enter num1 : ");
        int num1 =input.nextInt();
        System.out.print("Enter num2 : ");
        int num2 =input.nextInt();
        System.out.println("What you want to do : ");
        String[] str={"add","subtract","Multiply","Divide","Reminder"};
        int i;
        for ( i = 0; i < str.length; i++) {
            System.out.println((i) +"." +str[i]);
        }
        System.out.print("Enter you choice : ");
        int choice = input.nextInt();

        switch (choice){
            case 0 : int sum=num1+num2;
                System.out.println("Sum is "+sum);
                break;
            case 1 : int sub=num1-num2;
                System.out.println("Subtract is "+sub);
                break;
            case 2 : int mul=num1*num2;
                System.out.println("Multiplication is "+mul);
                break;
            case 3 : float div=num1/num2;
                System.out.println("Division is "+div);
                break;
            case 4 : float rem=num1%num2;
                System.out.println("reminder is "+rem);
                break;
        }



    }
}
