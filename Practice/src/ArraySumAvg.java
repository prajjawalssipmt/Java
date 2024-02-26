public class ArraySumAvg {
    public static void main(String[] args) {

        System.out.println("Array Sum And Average");
        int sum = 0;
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("Sum of array is : "+sum);
        System.out.println("Average of array is : "+sum/arr.length);
    }
}
