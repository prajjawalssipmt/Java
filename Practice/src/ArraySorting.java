import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to sort the array");
        System.out.print("Enter array size : ");
        int size =input.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element no."+i+": ");
            arr[i]= input.nextInt();
        }
        System.out.println("\n your array is : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }

        int swap;
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if (arr[j]<arr[i]){
                     swap = arr[i];
                     arr[i] = arr[j];
                     arr[j]= swap;
                }
            }
        }

        System.out.println("\nSorted Array is->");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
