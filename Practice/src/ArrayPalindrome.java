import java.util.Scanner;

public class ArrayPalindrome {
    public static void main(String[] args) {

            System.out.println("Welcome to reverse array program");
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the size of array : ");
            int size= input.nextInt();
            int[] arr =new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("element no."+i+" ");
            arr[i]=input.nextInt();
        }
        System.out.println("Your array is ->");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        boolean isPalin = palindrome(arr,size);
        if(isPalin){
            System.out.println("Palindrome Array");
        }else {
            System.out.println("Not Palindrome array");
        }

        }

        public  static boolean palindrome(int[] arr,int size){

            for (int i = 0; i < size/2; i++) {
                if(arr[i]==arr[size-1-i]){
                        return true;
                }
            }
            return false;
        }
    }
