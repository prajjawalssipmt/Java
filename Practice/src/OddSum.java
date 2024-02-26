import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        int sum = sumofodd(num);
        System.out.println("Oddsum till " + num + " is " + sum);
    }

    public static int sumofodd(int oddnum) {
        int sum =0;
        int i =1;
        while (i<=oddnum){
            sum +=i;
            i+=2;
        }
        return sum;
        }
    }

