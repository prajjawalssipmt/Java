import java.util.Scanner;

public class ArrayCountElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Count the number of element in an array");
        int[] arr = {1,2,3,4,5,6,7,4,2,3,5,8,9,4,1,2,4,5,6,9,8,4,1,2,};

        System.out.print("Enter the number you want to count : ");
        int x= input.nextInt();
        int elecount = countelement(arr,x);
        System.out.print("The number of occrence : "+ elecount);
    }

    public static int countelement(int[] arr,int x) {
        int count =0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x)
                count++;
        }
        return count;
    }
}
