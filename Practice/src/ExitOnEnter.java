import java.util.Scanner;

public class ExitOnEnter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        while (true) {
            System.out.print("Enter the command : ");
            String command = input.next();
            if (command.equalsIgnoreCase("exit") ) {
                break;
            }
        }
        System.out.println("You have successfully exited");
    }
}
