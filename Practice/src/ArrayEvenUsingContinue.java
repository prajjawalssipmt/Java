import java.util.Scanner;

public class ArrayEvenUsingContinue {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = input.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element no."+i+" : ");
            arr[i] = input.nextInt();
        }

        System.out.println("your array is-> ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("your Even array is : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==1){
                continue;
            }
            System.out.print(arr[i]+" ");
         }
    }
}

