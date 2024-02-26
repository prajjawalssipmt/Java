import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Factorial Generator");
        System.out.print("Enter the number : ");
        int num=input.nextInt();
//        long fact=factfunc(num);
//        System.out.print("Factorial of a number is : "+fact);

        long recurse = factrecursion(num);
        System.out.print("Factorial of a number is : "+recurse);

    }

//    public static long factfunc(int num) {
//        long res=1;
//        for (int i = 1; i <= num; i++) {
//            res*=i;
//        }
//        return res;
//    }

    public static long factrecursion(int num) {
        if(num==1){
            return 1;
        }
        return num*factrecursion(num-1);
    }
}
