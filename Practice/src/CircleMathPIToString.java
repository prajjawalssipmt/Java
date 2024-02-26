import java.util.Scanner;

public class CircleMathPIToString {

    double radius;

    CircleMathPIToString(double radius){
        this.radius=radius;
    }
    double getCircumference(){
        return 2*radius*Math.PI;
    }

    double getArea(){
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Circle Props:\n Radius in cm : "+radius
                +" \nCircumference in cm : "+getCircumference()+",\n Area : "
                +getArea();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the world of circle");
        System.out.print("plz Enter your radius: ");
        double radius = input.nextDouble();
        CircleMathPIToString circle = new CircleMathPIToString(radius);
        System.out.println(circle);

    }
}
