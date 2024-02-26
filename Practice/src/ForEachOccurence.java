import java.util.Scanner;

public class ForEachOccurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to find foreach occurence");
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
        System.out.print("Now enter the number you want to search : ");
        int ele = input.nextInt();
        int occ= occurence(arr,ele);
        System.out.println("Element found :"+occ+" times");
    }

    public static int occurence(int[] arr, int num) {
        int count=0;
        for(int myarr : arr ){
            if (myarr==num)
                count++;
        }
        return count;
    }
}
