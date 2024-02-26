import java.util.Scanner;

public class MathFuncionClasss {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to Math Class");
        System.out.print("enter the number : ");
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
//        float num3 = input.nextFloat();
//
//        System.out.println(Math.abs(num));
//        System.out.println(Math.ceil(num));
//        System.out.println(Math.floor(num));
//        System.out.println(Math.round(num));

//        for (int i = 0; i <30 ; i++) {
//            System.out.print(Math.round(Math.random()*10 )+" ");
//        }

//        System.out.println(Math.sqrt(num));
//        System.out.println(Math.pow(num,2));
        System.out.println(Math.max(num1,num2));
    }
}
