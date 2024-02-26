import java.util.Scanner;

public class RecursionPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to recursion palindrome");
        System.out.print("Enter the String : ");
        String str=input.next();
        System.out.println("Your String is "+((isPalindrome(str)?"Palindrome":"Not Palindrome")));
    }

    public static boolean isPalindrome(String str) {
        if (str.length()<=1){
            return true;
        }
        int lastpos=str.length()-1;
        if (str.charAt(0) != str.charAt(lastpos)){
            return false;
        }

        String newStr=str.substring(1,lastpos);
        return isPalindrome(newStr);
    }
}
