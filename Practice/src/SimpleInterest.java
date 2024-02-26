import java.sql.SQLOutput;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        float p,r,t;
        double SI;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principle Amount : ");
        p = input.nextFloat();
        System.out.print("Enter Rate in percentage : ");
        r = input.nextFloat();
        System.out.print("Enter Time in years : ");
        t = input.nextFloat();
        SI = (p*r*t)/100;
        System.out.println("Simple Interest is : "+SI);

    }
}
