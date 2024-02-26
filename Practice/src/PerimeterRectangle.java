import java.sql.SQLOutput;
import java.util.Scanner;

public class PerimeterRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of recrtangle : ");
        int l = input.nextInt();
        System.out.print("Enter the breadth of rectangle : ");
        int b = input.nextInt();
        int peri = 2*(l+b);
        System.out.print("Perimeter of Rectangle is -> "+peri);
    }
}
