import java.util.Scanner;

public class ArrayMaxMin {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Welcome to the min max array");
        int[] myArr = ArrayUtility.inputArray();
        int max= max(myArr);
        int min = min(myArr);
        System.out.println("Max of the array is : "+max);
        System.out.println("Min of the array is : "+min);

    }

    public static int max(int[] arr) {
        if (arr.length==0){
            return Integer.MIN_VALUE;
        }
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max)
                max=arr[i];
        }
        return max;
    }

    public static int min(int[] arr) {
        if (arr.length==0){
            return Integer.MIN_VALUE;
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min)
                min=arr[i];
        }
        return min;
    }

}
