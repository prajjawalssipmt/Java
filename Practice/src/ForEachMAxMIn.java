import java.util.Scanner;

public class ForEachMAxMIn {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Welcom to check max an min in an array");
        System.out.print("No. of element in array : ");
        int num = input.nextInt();
        int[] arr= new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Element No. "+i+" : ");
            arr[i]=input.nextInt();
        }

        System.out.println("your array is -> ");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i]+" ");
        }

        int max=Integer.MIN_VALUE;
        for (int n: arr){
            if (max < n){
                max=n;
            }
        }
        System.out.println("Maximum number is "+max);
    }
}
