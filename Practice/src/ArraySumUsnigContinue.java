import java.util.Scanner;

public class ArraySumUsnigContinue {
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

        int sum = continuesum(arr);
        System.out.println("your sum is : "+sum);
    }

    public static int continuesum(int[] arr) {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0){
                continue;
            }
            sum+=arr[i];
        }
        return sum;
    }
}
