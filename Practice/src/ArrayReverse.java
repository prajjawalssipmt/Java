import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {


        System.out.println("Welcome to reverse array program");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size= input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("array no."+ i+" : ");
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nReserse Array is ->");
        for (int i = size-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }

    }
}
