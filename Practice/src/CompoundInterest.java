import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principle Amount : ");
        float p = input.nextFloat();
        System.out.print("Enter Rate in percentage : ");
      float  r = input.nextFloat();
        System.out.print("Enter Time in years : ");
      float  t = input.nextFloat();
        double CI = p*(1+r/100)*t;
        System.out.println("compound interest is : " + CI);
    }
}
