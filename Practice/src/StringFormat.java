import java.util.Scanner;

public class StringFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name= "Prajjawal Gupta";
        int age=23;
        System.out.printf("Hello %S, Your age is %d",name,age);
//        or
        System.out.println("Hello "+ name+", Your age is "+age);
    }
}
