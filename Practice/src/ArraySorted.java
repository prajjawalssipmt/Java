//import java.util.Scanner;

public class ArraySorted {
    public static void main(String[] args) {
//        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to check sorted array");
        int[] myArr = ArrayUtility.inputArray();

        boolean isInc = isIncreasing(myArr);
        boolean isDec = isDecreasing(myArr);
        if (isDec || isInc){
            System.out.println("your array is sorted");
        }else {
            System.out.println("Your Array is not sorted");
        }

    }

    public static boolean isDecreasing(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>arr[i-1])
                return false;
        }
        return  true;
    }
    public static boolean isIncreasing(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<arr[i-1])
                return false;
        }
        return  true;
    }
}
