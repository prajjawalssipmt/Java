import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("welcome to the array input");
        System.out.print("Enter the size of array : ");
        int size = input.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element no."+i+" : ");
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
