import java.util.Scanner;

public class SumofDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long sum=0,num,rem,div;
        System.out.print("Enter the number : ");
         num = input.nextInt();

        while(num!=0){
             rem = num%10;
            sum+=rem;
            div = num/10;
            num=div;

        }
        System.out.println("sum of digit is : "+sum);
    }
}
