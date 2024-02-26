import java.util.Scanner;

public class DegreeConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Degree in Farehnite : ");
        float f = input.nextFloat();
        double c = (f-32)*5/9;
        System.out.println("Degree in Celcius is : " +c);
    }
}
