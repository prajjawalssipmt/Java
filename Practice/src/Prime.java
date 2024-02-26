import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int flag=0;

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        if (num==0 || num==1){
          System.out.println("Not a prime number");
        }

        for (int i = 2; i <=num/2 ; i++) {
            if (num%i==0){
                System.out.println("Not a prime number");
                flag = 1;
                break;
            }
            }
        if (flag==0){
            System.out.println("Prime Number");
        }
        }

    }

