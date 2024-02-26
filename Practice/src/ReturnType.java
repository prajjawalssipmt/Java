import java.util.Scanner;

public class ReturnType {
    public static void main(String[] args) {
        greet();
       int num1 = readNum();
       int num2 =readNum();
       result(num1,num2);
    }

        public static  void greet(){
            System.out.println("Welcome to the Calculator");
        }

        public  static int readNum(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number : ");
            int num = input.nextInt();
            return num;
        }
        public static int result(int a ,int b){
        int sum = a+b;
            System.out.println("Sum of two number : " + sum);
            return sum;
        }
    }
