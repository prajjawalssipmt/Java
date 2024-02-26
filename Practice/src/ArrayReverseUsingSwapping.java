import java.util.Scanner;

public class ArrayReverseUsingSwapping {
    public static void main(String[] args) {
        System.out.println("Welcome to reverse array using swapping");
        int[] arr=arrayInput();
        reverse(arr);
    }

    public static int[] arrayInput() {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("enter element no."+i+" :");
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        return arr;
    }

    public static int[] reverse(int[] arr) {
        System.out.println("\nReverse Array is ->");
        for (int i = 0; i<=arr.length/2; i++) {
            int swap = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = swap;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        return arr;
    }
}
