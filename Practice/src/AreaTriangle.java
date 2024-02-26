import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of triangle : ");
        float h = input.nextFloat();
        System.out.print("Enter the breadth of triangle : ");
        float b = input.nextFloat();
        double area = 0.5 * (b*h);
        System.out.println("Area of Triangle is : "+ area);

    }
}
