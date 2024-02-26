import java.util.Scanner;

public class DoWhilePasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Password Checker");
        String pass;
        do {
            System.out.print("Enter the valid password : ");
            pass = input.next();
        }while(!validpassword(pass));
        System.out.println("Thanks for entering valid password");
    }
    public static boolean validpassword(String password){
        return password.length()>7;
    }
}
